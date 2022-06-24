package shop.exception;

public class InvalidInputException extends RuntimeException {
    InvalidInputException(String message) {
        super("Invalid input:" + message);
    }

    InvalidInputException() {
        super("Invalid input");
    }
}
