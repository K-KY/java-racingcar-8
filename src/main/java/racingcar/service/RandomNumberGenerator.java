package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private static final int DEFAULT_MIN = 0;
    private static final int DEFAULT_MAX = 9;

    public static Integer getRandomNumber() {
        return getRandomNumber(DEFAULT_MIN, DEFAULT_MAX);
    }

    public static Integer getRandomNumber(int min, int max) {
        return Randoms.pickNumberInRange(min, max);
    }
}
