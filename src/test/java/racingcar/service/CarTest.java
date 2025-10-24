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

    @Test
    @DisplayName("동등성 테스트")
    void equalsTest() {
        Car car1 = new Car("name");
        Car car2 = new Car("name");
        assertThat(car1).isEqualTo(car2);
        assertThat(car1.hashCode()).isEqualTo(car2.hashCode());
    }
    @Test
    @DisplayName("동등성 테스트 같은 클래스 다른 객체")
    void  notEqualsTest() {
        Car car1 = new Car("name");
        Car car2 = new Car("name1");
        assertThat(car1).isNotEqualTo(car2);
        assertThat(car1.hashCode()).isNotEqualTo(car2.hashCode());
    }

    @Test
    @DisplayName("동등성 테스트 다른 클래스")
    void  notEqualsTest2() {
        Car car1 = new Car("name");
        Object car2 = new Object();
        assertThat(car1).isNotEqualTo(car2);
        assertThat(car1.hashCode()).isNotEqualTo(car2.hashCode());
    }
}