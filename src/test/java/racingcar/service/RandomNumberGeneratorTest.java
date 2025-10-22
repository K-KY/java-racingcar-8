package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {

    @Test
    @DisplayName("0 ~ 9의 무작위 숫자 반환")
    void randomNumberTest() {

        assertThat(RandomNumberGenerator.getRandomNumber())
                .isIn(0,1,2,3,4,5,6,7,8,9);
    }

}