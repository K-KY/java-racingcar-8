package racingcar.service.validator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameCheckerTest {

    @Test
    void nameLengthIsFive() {
        assertThatThrownBy(() -> CarNameChecker.lengthCheck("123456"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void nameEmptyCheck() {
        assertThatThrownBy(() -> CarNameChecker.emptyCheck(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void nameLengthCheckTrue() {
        assertThatCode(() -> CarNameChecker.lengthCheck("12345"))
                .doesNotThrowAnyException();
    }

    @Test
    void nameEmptyCheckTrue() {
        assertThatCode(() -> CarNameChecker.emptyCheck("999"))
                .doesNotThrowAnyException();
    }
}