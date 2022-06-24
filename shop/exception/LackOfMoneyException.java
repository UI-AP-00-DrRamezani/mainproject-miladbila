package shop.exception;

public class LackOfMoneyException extends InvalidPurchaseException {
    public LackOfMoneyException(String message) {
        super("Invalid purchase:lack of money:" + message);
    }

    public LackOfMoneyException() {
        super("Invalid purchase:lack of money");
    }
}
