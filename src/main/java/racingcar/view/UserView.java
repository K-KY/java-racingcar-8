package racingcar.view;

import racingcar.controller.RaceController;
import racingcar.service.dto.RaceResultDto;

public class UserView {

    private static final RaceController raceController = RaceController.getInstance();
    private static final String INPUT_CARS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_LAPS = "시도할 횟수는 몇 회인가요?";

    public static void inputRaceInfo() {
        print(INPUT_CARS);
        String[] carNames = Input.cars();
        print(INPUT_LAPS);
        int laps = Input.laps();
        RaceResultDto raceResult = raceController.race(carNames, laps);
        Output.printResult(raceResult);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
