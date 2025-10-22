package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TrackTest {

    private static final Track TRACK = new Track();

    @Test
    @DisplayName("같은 이름의 자동차가 없으면 리스트에 넣고 true 반환")
    void addCarReturnTrueTest() {
        assertThat(TRACK.addCar(new Car("add2"))).isTrue();
    }

    @Test
    @DisplayName("같은 이름의 자동차가 있으면 false 반환")
    void addCarReturnFalseTest() {
        TRACK.addCar(new Car("add3"));
        assertThat(TRACK.addCar(new Car("add3"))).isFalse();
    }

    @Test
    @DisplayName("같은 이름의 자동차가 있으면 true 반환")
    void containsCarTrueTest() {
        TRACK.addCar(new Car("name"));
        assertThat(TRACK.contains(new Car("name"))).isTrue();
    }

    @Test
    @DisplayName("같은 이름의 자동차가 없으면 false 반환")
    void containsCarFalseTest() {
        TRACK.addCar(new Car("name"));
        assertThat(TRACK.contains(new Car("CONTAIN"))).isFalse();
    }

    @Test
    @DisplayName("참자 자동차의 개수만큼 숫자 반환")
    void participantsCountTest() {
        Track track = new Track();
        track.addCar(new Car("count"));
        assertThat(track.participantsCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("Track이 반환한 리스트는 수정이 불가능")
    void getCarsReturnsUnmodifiableTest() {
        Track track = new Track();
        track.addCar(new Car("name"));
        track.addCar(new Car("count"));
        List<Car> cars = track.getCars();
        assertThatThrownBy(() -> cars.add(new Car("new")))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    @DisplayName("참가 자동차의 점수를 문자열로 변환한 리스트를 반환")
    void getParticipantProgress() {
        Track track = new Track();
        track.addCar(new Car("name"));
        track.addCar(new Car("name1"));
        assertThat(track.getParticipantProgress()).isEqualTo(List.of("name : ", "name1 : "));
    }

    @Test
    @DisplayName("진행도를 업데이트 하고 참가 자동차 진행도 반환")
    void rollProgressTest() {
        Track track = new Track();
        track.addCar(new Car("name"));
        track.addCar(new Car("name1"));
        assertThat(track.rollProgress()).isInstanceOf(List.class);
    }
}