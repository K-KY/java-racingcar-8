package racingcar.service.validator;

public class CarNameChecker {
    public static void lengthCheck(String name) {
        if (name.length() <= 5) {
            return;
        }
        throw new IllegalArgumentException("이름 길이는 최대 5글자입니다.");
    }

    public static void emptyCheck(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("이름은 빈칸일 수 없습니다.");
        }
    }
}
