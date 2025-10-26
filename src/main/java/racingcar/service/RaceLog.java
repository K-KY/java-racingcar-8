package racingcar.service;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class RaceLog {
    private final List<String> log;

    public RaceLog(List<String> log) {
        this.log = log;
    }

    public List<String> getLog() {
        return Collections.unmodifiableList(log);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        log.forEach(joiner::add);
        return joiner.toString();
    }
}
