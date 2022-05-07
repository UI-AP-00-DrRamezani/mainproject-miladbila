package shop.exception;

public class LackOfMoneyException extends InvalidPurchaseException {
    LackOfMoneyException(String message) {
        super(message);
    }

    LackOfMoneyException() {
        super("Invalid purchase:lack of money");
    }
}
