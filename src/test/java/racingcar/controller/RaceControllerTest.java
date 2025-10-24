package racingcar.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.service.RaceLog;

import static org.assertj.core.api.Assertions.assertThat;


class RaceControllerTest {

    @Test
    @DisplayName("컨트롤러 테스트")
    void race() {
        RaceController instance = RaceController.getInstance();
        assertThat(instance.race(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, 5))
                .anyMatch(RaceLog.class::isInstance);
    }

    @Test
    @DisplayName("싱글톤 테스트")
    void single() {
        RaceController instance = RaceController.getInstance();
        assertThat(RaceController.getInstance()).isSameAs(instance);
    }
}