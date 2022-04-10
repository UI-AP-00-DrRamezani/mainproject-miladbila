package shop.controller;

import shop.controller.products.ProductsController;
import shop.entities.Category;
import shop.entities.SalesInvoice;
import shop.entities.products.Product;
import shop.pages.ProductPage;
import shop.roles.Buyer;
import shop.roles.Seller;

public class SellerPanelController {
    public static void productList(Seller seller) {
        for (Product a:seller.getProductsForSale()) {
            ProductsController.shortProductSpec(a);
        }
    }

    public static void saleHistoryList(Seller seller) {
        for (SalesInvoice a:seller.getSalesHistory())
            System.out.println(a.toString());
    }

    public static void selectProduct(int index, Seller seller) {
        ProductPage.showInfo(seller.getProductsForSale().get(index - 1), null);
    }

    public static void deleteProduct(int index, Seller seller) {
        seller.getProductsForSale().get(index - 1).setConfirmStatus(Product.status.DELETE_REQUEST);
    }

    public static void editProduct(int index, Seller seller) {
        seller.getProductsForSale().get(index - 1).setConfirmStatus(Product.status.EDITED);
    }
}
