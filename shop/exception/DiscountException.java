package shop.exception;

public class DiscountException extends RuntimeException {
    DiscountException(String message) {
        super("Discount error:" + message);
    }

    DiscountException() {
        super("Discount error");
    }
}
