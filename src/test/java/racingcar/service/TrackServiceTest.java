package racingcar.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TrackServiceTest {

    @Test
    void addParticipant() {
        TrackService instance = TrackService.getInstance();
        assertThat(instance.addParticipant(new String[]{"1", "2", "3", "4"}))
                .isInstanceOf(Track.class);
    }

    @Test
    void race() {
        TrackService instance = TrackService.getInstance();
        Track track = instance.addParticipant(new String[]{"1", "2", "3", "4"});
        List<RaceLog> race = instance.race(track, 10);
        assertThat(race).isInstanceOf(List.class);
        assertThat(race)
                .allMatch(RaceLog.class::isInstance);
    }
}