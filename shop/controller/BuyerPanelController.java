package shop.controller;

import shop.controller.products.ProductsController;
import shop.entities.PurchaseInvoice;
import shop.entities.SalesInvoice;
import shop.entities.products.Product;
import shop.exception.LackOfMoneyException;
import shop.roles.Buyer;
import shop.roles.Seller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BuyerPanelController {
    public static void cartProducts(Buyer buyer) {
        for (Product a : buyer.getCart()) {
            System.out.println(ProductsController.shortProductSpec(a));
        }
    }

    public static void increaseCredit(Buyer buyer, double amount) {
        buyer.setCredit(buyer.getCredit() + amount);
    }

    public static void purchaseHistory(Buyer buyer) {
        for (PurchaseInvoice a : buyer.getPurchaseInvoices())
            System.out.println(a.toString() + "\n-----------------");
    }

    public static void purchase(Buyer buyer) {
        double priceSum = 0;
        for (Product a : buyer.getCart()) {
            priceSum += a.getPrice();
        }
        if (priceSum > buyer.getCredit()) {
            throw new LackOfMoneyException("Your account balance is not enough");
        }
        PurchaseInvoice purchaseInvoice = new PurchaseInvoice(priceSum, buyer.getCart().toArray(new Product[0]));
        buyer.setPurchaseInvoices(purchaseInvoice);
        writePurchaseHistory(buyer, purchaseInvoice);
        for (Product a : buyer.getCart()) {
            SalesInvoice salesInvoice = new SalesInvoice(a.getPrice(), a, buyer.getName() + buyer.getLastName());
            a.getSeller().setSalesHistory(salesInvoice);
            writeSalesHistory(a.getSeller(), salesInvoice);
        }
        buyer.getCart().clear();
    }

    private static void writeSalesHistory(Seller seller, SalesInvoice salesInvoice) {
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream("saved data\\users\\sellers\\seller " + seller.getID() + "sale history.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.writeObject(salesInvoice);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writePurchaseHistory(Buyer buyer, PurchaseInvoice purchaseInvoice) {
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream("saved data\\users\\buyers\\buyer " + buyer.getID() + "sale history.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.writeObject(purchaseInvoice);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
