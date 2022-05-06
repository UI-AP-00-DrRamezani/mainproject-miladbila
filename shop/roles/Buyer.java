package shop.roles;

import shop.entities.Account;
import shop.entities.PurchaseInvoice;
import shop.entities.products.Product;

import java.util.ArrayList;

public class Buyer extends Account {
    private ArrayList<Product> cart = new ArrayList<>();
    private ArrayList<PurchaseInvoice> purchaseInvoices = new ArrayList<>();
    private double credit = 0;


    public Buyer(String username, String name, String lastName, String email, int phoneNumber, String password) {
        super(username, name, lastName, email, phoneNumber, password);
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
}
