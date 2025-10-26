package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public static String[] cars() {
        return Console.readLine().split(",");
    }

    public static int laps() {
        return Integer.parseInt(Console.readLine());
    }
}
