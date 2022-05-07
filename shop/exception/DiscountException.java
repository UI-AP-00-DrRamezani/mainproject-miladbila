package shop.exception;

public class DiscountException extends RuntimeException {
    DiscountException(String message) {
        super(message);
    }

    DiscountException() {
        super("Discount error");
    }
}
