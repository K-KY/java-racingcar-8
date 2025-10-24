package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RaceLogTest {

    @Test
    @DisplayName("레이스 로그 불변 리스트 반환")
    void getLog() {
        RaceLog raceLog = new RaceLog(List.of());
        assertThatThrownBy(() -> raceLog.getLog().add(""))
                .isInstanceOf(UnsupportedOperationException.class);
    }
}