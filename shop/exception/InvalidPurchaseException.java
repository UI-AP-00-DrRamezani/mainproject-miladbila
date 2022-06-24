package shop.exception;

public class InvalidPurchaseException extends RuntimeException {
    InvalidPurchaseException(String message) {
        super("Invalid Purchase:" + message);
    }

    InvalidPurchaseException() {
        super("Invalid Purchase");
    }
}
