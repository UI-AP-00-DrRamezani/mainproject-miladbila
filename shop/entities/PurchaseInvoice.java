package shop.entities;

public class PurchaseInvoice {
    private final int ID;
    private final String date;
    private final double amountPaid;
    private final Product[] productsPurchased;
    private final String sellerName;
    private boolean deliveryStatus;

    public PurchaseInvoice(int ID, String date, double amountPaid, Product[] productsPurchased, String sellerName, boolean deliveryStatus) {
        this.ID = ID;
        this.date = date;
        this.amountPaid = amountPaid;
        this.productsPurchased = productsPurchased;
        this.sellerName = sellerName;
        this.deliveryStatus = false;
    }

    public int getID() {
        return ID;
    }

    public String getDate() {
        return date;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public Product[] getProductsPurchased() {
        return productsPurchased;
    }

    public String getSellerName() {
        return sellerName;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
