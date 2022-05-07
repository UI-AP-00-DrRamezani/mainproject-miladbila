package shop.exception;

public class InvalidInputException extends RuntimeException {
    InvalidInputException(String message) {
        super(message);
    }

    InvalidInputException() {
        super("Invalid input");
    }
}
