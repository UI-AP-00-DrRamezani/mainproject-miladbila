package shop.entities;

import shop.entities.products.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class PurchaseInvoice {
    private final int ID;
    private final String date;
    private final double amountPaid;
    private final Product[] productsPurchased;
    private boolean deliveryStatus;
    private static int lastId = 100000;

    public PurchaseInvoice(double amountPaid, Product[] productsPurchased) {
        this.ID = lastId++;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
        this.amountPaid = amountPaid;
        this.productsPurchased = productsPurchased;
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

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                "\ndate='" + date +
                "\namountPaid=" + amountPaid +
                "\nproductsPurchased=" + Arrays.toString(productsPurchased) +
                "\ndeliveryStatus=" + deliveryStatus;
    }
}
