package shop.exception;

public class LackOfInventoryException extends InvalidPurchaseException {
    LackOfInventoryException(String message) {
        super("Invalid purchase:lack of inventory:" + message);
    }

    LackOfInventoryException() {
        super("Invalid purchase:lack of inventory");
    }
}
