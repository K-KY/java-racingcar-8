package racingcar.controller;

import racingcar.service.Track;
import racingcar.service.TrackService;
import racingcar.service.RaceLog;

import java.util.List;

public class RaceController {
    private static RaceController raceController;
    private final TrackService trackService;

    private RaceController(TrackService trackService) {
        this.trackService = trackService;
    }

    public static RaceController getInstance() {
        if (raceController == null) {
            raceController = new RaceController(TrackService.getInstance());
        }
        return raceController;
    }


    public List<RaceLog> race(String[] participants, int laps) {
        Track track = trackService.addParticipant(participants);
        return trackService.race(track, laps);
    }
}