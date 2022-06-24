package shop.exception;

public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super("Invalid login:" + message);
    }

    public InvalidLoginException() {
        super("Invalid login");
    }
}
