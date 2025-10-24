package racingcar.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {
    private final List<Car> cars;

    public Track() {
        this.cars = new ArrayList<>();
    }

    public boolean addCar(Car car) {
        if (contains(car)) {
            throw new IllegalArgumentException("이름은 중복 될 수 없습니다. : " + car.getName());
        }
        cars.add(car);
        return true;
    }

    public int participantsCount() {
        return cars.size();
    }

    public boolean contains(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public List<String> getParticipantProgress() {
        return cars.stream()
                .map(Car::toString)
                .toList();
    }

    public List<String> rollProgress() {
        cars.forEach(car -> car.updateProgress(RandomNumberGenerator.getRandomNumber()));
        return getParticipantProgress();
    }
}