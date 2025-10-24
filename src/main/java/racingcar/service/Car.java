package racingcar.service;

import java.util.Objects;

public class Car {
    private static final int CUT = 5;
    private final String name;
    private int progress;
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    public void updateProgress(int number) {
        if (number >= CUT) {
            progress++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(progress);
    }
}