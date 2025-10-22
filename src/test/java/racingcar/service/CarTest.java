package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("자동차의 이름을 반환")
    void getNameTest() {
        Car car = new Car("name");
        assertThat(car.getName()).isEqualTo("name");
    }

    @Test
    @DisplayName("자동차의 진행도를 반환 초기 진행도 0")
    void getCarProgress() {
        Car car = new Car("name");
        assertThat(car.getProgress()).isEqualTo(0);
    }

    @Test
    @DisplayName("진행도 업데이트")
    void updateCatProgress() {
        Car car = new Car("name");
        assertThat(car.getProgress()).isEqualTo(0);
        car.updateProgress(5);
        assertThat(car.getProgress()).isEqualTo(1);
    }
    @Test
    @DisplayName("5 이하라면 진행도 업데이트 하지 않음")
    void updateCatProgress2() {
        Car car = new Car("name");
        assertThat(car.getProgress()).isEqualTo(0);
        car.updateProgress(4);
        assertThat(car.getProgress()).isEqualTo(0);
    }

    @Test
    @DisplayName("toString이 이름과 진행도 반환")
    void toStringTest() {
        Car car = new Car("name");
        car.updateProgress(5);
        assertThat(car.toString()).isEqualTo("name : -");
    }
}