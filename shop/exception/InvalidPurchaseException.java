package shop.exception;

public class InvalidPurchaseException extends RuntimeException {
    InvalidPurchaseException(String message) {
        super(message);
    }

    InvalidPurchaseException() {
        super("Invalid Purchase");
    }
}
