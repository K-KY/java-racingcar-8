package racingcar.service;

import racingcar.service.dto.RaceResultDto;

import java.util.ArrayList;
import java.util.List;

public class TrackService {
    private static TrackService trackService;

    private TrackService() {}

    public static TrackService getInstance() {
        if (trackService == null) {
            trackService = new TrackService();
        }
        return trackService;
    }

    public Track addParticipant(String[] participants) {
        Track track = new Track();
        for (String participant : participants) {
            track.addCar(new Car(participant));
        }
        return track;
    }

    public RaceResultDto race(Track track, int laps) {
        List<RaceLog> raceLogs = new ArrayList<>();
        for (int i = 0; i < laps; i++) {
            raceLogs.add(new RaceLog(track.rollProgress()));
        }
        List<Car> winners = track.getWinners();
        return new RaceResultDto(raceLogs, winners);
    }
}
