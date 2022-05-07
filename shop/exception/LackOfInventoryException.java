package shop.exception;

public class LackOfInventoryException extends InvalidPurchaseException {
    LackOfInventoryException(String message) {
        super(message);
    }

    LackOfInventoryException() {
        super("Invalid purchase:lack of inventory");
    }
}
