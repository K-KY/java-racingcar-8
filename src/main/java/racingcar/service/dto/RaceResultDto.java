package racingcar.service.dto;

import racingcar.service.Car;
import racingcar.service.RaceLog;

import java.util.List;

public record RaceResultDto(List<RaceLog> raceLogs, List<Car> winners) {
}