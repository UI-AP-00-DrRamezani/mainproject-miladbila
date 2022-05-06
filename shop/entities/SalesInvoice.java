package shop.entities;

import shop.controller.products.ProductsController;
import shop.entities.products.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SalesInvoice {
    private final int ID;
    private final String date;
    private final double amountPaid;
    private final Product productSold;
    private final String buyerName;
    private boolean deliveryStatus;
    private static int lastId = 200000;

    public SalesInvoice(double amountPaid, Product productSold, String buyerName) {
        this.ID = lastId++;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
        this.amountPaid = amountPaid;
        this.productSold = productSold;
        this.buyerName = buyerName;
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

    public Product getProductSold() {
        return productSold;
    }

    public String getBuyerName() {
        return buyerName;
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
                "\nproductsPurchased=" + ProductsController.shortProductSpec(productSold) +
                "\nbuyerName='" + buyerName +
                "\ndeliveryStatus=" + deliveryStatus;
    }
}
