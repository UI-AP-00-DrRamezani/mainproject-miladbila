package shop.roles;

import shop.entities.Account;
import shop.entities.PurchaseInvoice;
import shop.entities.products.Product;

import java.util.ArrayList;

public class Buyer extends Account {
    private static int LAST_ID = 1000;
    private final int ID;
    private ArrayList<Product> cart = new ArrayList<>();
    private ArrayList<PurchaseInvoice> purchaseInvoices = new ArrayList<>();
    private double credit = 0;


    public Buyer(String username, String name, String lastName, String email, int phoneNumber, String password) {
        super(username, name, lastName, email, phoneNumber, password);
        this.ID = LAST_ID++;
    }

    public Buyer(int ID, String username, String name, String lastName, String email, int phoneNumber, String password) {
        super(username, name, lastName, email, phoneNumber, password);
        this.ID = ID;
        LAST_ID = ID++;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(Product product) {
        this.cart.add(product);
    }

    public ArrayList<PurchaseInvoice> getPurchaseInvoices() {
        return purchaseInvoices;
    }

    public void setPurchaseInvoices(PurchaseInvoice purchaseInvoices) {
        this.purchaseInvoices.add(purchaseInvoices);
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getID() {
        return ID;
    }
}
