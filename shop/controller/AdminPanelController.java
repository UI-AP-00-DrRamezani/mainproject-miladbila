package shop.controller;

import shop.roles.Buyer;
import shop.roles.Seller;

public class AdminPanelController {
    public static void sellersList() {
        int i = 1;
        for (Seller a : SellerController.getSellerList()) {
            System.out.println(i + ". company name:" + a.getCompanyName() + "  registration status:" + a.getAccountStatus());
            i++;
        }
    }

    public static void buyerList() {
        int i = 1;
        for (Buyer a : BuyerController.getBuyerList()) {
            System.out.println();
            i++;
        }
    }

    public static void deleteSeller(int index) {
        SellerController.getSellerList().remove(index - 1);
    }

    public static void deleteBuyer(int index) {
        BuyerController.getBuyerList().remove(index - 1);
    }
}
