package racingcar.service;

import java.util.Collections;
import java.util.List;

public class RaceLog {
    private final List<String> log;

    public RaceLog(List<String> log) {
        this.log = log;
    }

    public List<String> getLog() {
        return Collections.unmodifiableList(log);
    }
}