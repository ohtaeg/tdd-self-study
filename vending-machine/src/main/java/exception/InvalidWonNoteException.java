package exception;

public class InvalidWonNoteException extends RuntimeException{
    private static final String MESSAGE = "잘못된 지폐를 삽입하셨습니다.";
    public InvalidWonNoteException() {
        super(MESSAGE);
    }

    public InvalidWonNoteException(String message) {
        super(message);
    }
}
