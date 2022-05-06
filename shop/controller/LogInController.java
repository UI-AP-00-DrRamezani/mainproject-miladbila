package shop.controller;

import shop.pages.AdminPanel;
import shop.pages.BuyerPanel;
import shop.pages.LogIn;
import shop.pages.SellerPanel;
import shop.roles.Buyer;
import shop.roles.Seller;

public class LogInController {
    public static void login(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            LogIn.loginStatus = true;
            AdminPanel.adminPanel();
            return;
        }
        for (Seller a : SellerController.getSellerList())
            if (a.getUsername().equals(username))
                if (a.getPassword().equals(password)) {
                    if (a.getAccountStatus() == Seller.status.CONFIRMED) {
                        LogIn.loginStatus = true;
                        SellerPanel.sellerPanel(a);
                    } else if (a.getAccountStatus() == Seller.status.PENDING)
                        System.out.println("Your account has not yet been confirmed by the administrator. Please wait");
                    else
                        System.out.println("Your account has still been rejected by the administrator");
                    return;
                } else
                    break;
        for (Buyer a : BuyerController.getBuyerList())
            if (a.getUsername().equals(username))
                if (a.getPassword().equals(password)) {
                    LogIn.loginStatus = true;
                    BuyerPanel.buyerPanel(a);
                    return;
                } else
                    break;
        LogIn.loginStatus = false;
    }
}
