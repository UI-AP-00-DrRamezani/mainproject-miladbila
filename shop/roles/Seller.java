package shop.roles;

import shop.entities.Account;
import shop.entities.SalesInvoice;
import shop.entities.products.Product;

import java.util.ArrayList;

public class Seller extends Account {

    private String companyName;
    private String companyEmail;
    private ArrayList<Product> productsForSale = new ArrayList<>();
    private ArrayList<SalesInvoice> salesHistory = new ArrayList<>();
    private status accountStatus = status.PENDING;

    public enum status {PENDING, CONFIRMED, REJECTED}

    public Seller(String username, String name, String lastName, String email, int phoneNumber, String password,
                  String companyName, String companyEmail) {
        super(username, name, lastName, email, phoneNumber, password);
        this.companyName = companyName;
        this.companyEmail = companyEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public ArrayList<Product> getProductsForSale() {
        return productsForSale;
    }

    public void setProductsForSale(Product product) {
        this.productsForSale.add(product);
    }

    public ArrayList<SalesInvoice> getSalesHistory() {
        return salesHistory;
    }

    public void setSalesHistory(SalesInvoice salesInvoice) {
        this.salesHistory.add(salesInvoice);
    }

    public status getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(status accountStatus) {
        this.accountStatus = accountStatus;
    }
}
