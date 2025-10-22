package racingcar.service;

public class Car {
    private static final int CUT = 5;
    private final String name;
    private int progress;
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    public void updateProgress(int number) {
        if (number >= CUT) {
            progress++;
        }
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(progress);
    }
}
