package shop.controller;

import shop.controller.products.ProductsController;
import shop.entities.products.Product;
import shop.roles.Buyer;
import shop.roles.Seller;

public class AdminPanelController {
    public static void sellersList() {
        int i = 1;
        for (Seller a : SellerController.getSellerList()) {
            System.out.println(i + ". company name:" + a.getCompanyName() + "  registration status:" + a.getAccountStatus()
                    + "  username:" + a.getUsername());
            i++;
        }
    }

    public static void buyerList() {
        int i = 1;
        for (Buyer a : BuyerController.getBuyerList()) {
            System.out.println(i + ". name" + a.getName() + "  last name:" + a.getLastName() + " username:" + a.getUsername());
            i++;
        }
    }

    public static void deleteSeller(int index) {
        SellerController.getSellerList().remove(index - 1);
    }

    public static void deleteBuyer(int index) {
        BuyerController.getBuyerList().remove(index - 1);
    }

    public static void changeSellerStatus(int index, Seller.status status) {
        SellerController.getSellerList().get(index - 1).setAccountStatus(status);
    }

    public static void viewProducts() {
        int i = 1;
        for (Product a : ProductsController.getProducts()) {
            System.out.println(i + ". ID:" + a.getID() + "  name:" + a.getName() + "  price:" + a.getPrice());
            i++;
        }
    }

    public static void changeProductsStatus(int index, Product.status status) {
        ProductsController.getProducts().get(index - 1).setConfirmStatus(status);
    }

    public static void deleteProduct(int index) {
        ProductsController.getProducts().remove(index - 1);
    }
}
