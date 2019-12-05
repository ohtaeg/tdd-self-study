package exception;

public class InvalidCoinException extends RuntimeException {
    private static final String MESSAGE = "잘못된 동전을 삽입하셨습니다.";
    public InvalidCoinException() {
        super(MESSAGE);
    }

    public InvalidCoinException(String message) {
        super(message);
    }
}
