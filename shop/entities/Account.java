package shop.entities;

import java.util.ArrayList;

public class Account {
    private String username;
    private String name;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String password;
    private String role;
    private double credit;
    private ArrayList<PurchaseInvoice> purchaseInvoices = new ArrayList<PurchaseInvoice>();
    private ArrayList<SalesInvoice> salesInvoice = new ArrayList<SalesInvoice>();

}