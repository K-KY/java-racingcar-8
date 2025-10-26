package racingcar.controller;

import racingcar.service.Track;
import racingcar.service.TrackService;
import racingcar.service.dto.RaceResultDto;


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


    public RaceResultDto race(String[] participants, int laps) {
        Track track = trackService.addParticipant(participants);
        return trackService.race(track, laps);
    }
}