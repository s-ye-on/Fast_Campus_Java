package RacingCar;

public class Rule {
    private static final String NAME_OVER_SIZE = "[ERROR] 이름은 5자를 넘어갈 수 없습니다.";
    private static final String MISSING_COMMA = "[ERROR] 자동차의 이름을 입력할 때 반드시 쉼표가 필요합니다.";
    private static final String ROUND_IS_NOT_NATURAL = "[ERROR] 시도 횟수는 자연수여야 합니다.";

    private static final int NAME_MAX_LENGTH = 5;
    private static final int MIN_ROUND = 1;

    private Rule() {
        // 함수만 제공하는 클래스(유틸리티 클래스)는 인스턴스화를 막아야 한다.
    }

    public static void validateNameLength(String name) { // 5자 이상 넘어가면 안된다.
        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(NAME_OVER_SIZE);
        }
    }

    public static void validatePlayersInput(String input) { // 쉼표를 꼭 포함해야한다.
        if (input != null && !input.contains(",")) {
            throw new IllegalArgumentException(MISSING_COMMA);
        }
    }

    public static void validateNaturalNumber(int round) { // 실행 횟수가 0보다 커야한다.
        if (round < MIN_ROUND) {
            throw new IllegalArgumentException(ROUND_IS_NOT_NATURAL);
        }
    }
}
