package racingcar.view;

import racingcar.service.RaceLog;
import racingcar.service.dto.RaceResultDto;

import java.util.List;
import java.util.StringJoiner;

public class Output {
    private static final String WINNER = "최종 우승자 : ";
    private static final String DELIMITER = ", ";

    public static void printResult(RaceResultDto raceResult) {
        printLog(raceResult);
        printWinners(raceResult);
    }

    public static void printLog(RaceResultDto raceResult) {
        List<RaceLog> raceLogs = raceResult.raceLogs();

        raceLogs.forEach(raceLog -> {
            System.out.println(raceLog.toString());
            System.out.println();
        });
    }

    public static void printWinners(RaceResultDto raceResult) {
        StringJoiner joiner = new StringJoiner(DELIMITER);
        raceResult.winners().forEach(winner -> joiner.add(winner.getName()));
        System.out.println(WINNER + joiner);
    }
}
