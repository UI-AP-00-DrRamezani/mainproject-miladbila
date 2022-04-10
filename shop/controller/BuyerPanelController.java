package shop.controller;

import shop.controller.products.ProductsController;
import shop.entities.PurchaseInvoice;
import shop.entities.SalesInvoice;
import shop.entities.products.Product;
import shop.roles.Buyer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
            System.out.println("Your account balance is not enough");
            return;
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        buyer.setPurchaseInvoices(new PurchaseInvoice(priceSum, buyer.getCart().toArray(new Product[0])));
        for (Product a : buyer.getCart()) {
            a.getSeller().setSalesHistory(new SalesInvoice(a.getPrice(), a, buyer.getName() + buyer.getLastName()));
        }
        buyer.getCart().clear();
    }
}
