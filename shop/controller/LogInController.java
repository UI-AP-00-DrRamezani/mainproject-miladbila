package shop.controller;

import shop.exception.InvalidLoginException;
import shop.pages.AdminPanel;
import shop.pages.BuyerPanel;
import shop.pages.LogIn;
import shop.pages.SellerPanel;
import shop.roles.Buyer;
import shop.roles.Seller;

public class LogInController {
    public static void login(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            AdminPanel.adminPanel();
            return;
        }
        for (Seller a : SellerController.getSellerList())
            if (a.getUsername().equals(username))
                if (a.getPassword().equals(password)) {
                    if (a.getAccountStatus() == Seller.status.CONFIRMED) {
                        SellerPanel.sellerPanel(a);
                    } else if (a.getAccountStatus() == Seller.status.PENDING)
                        throw new InvalidLoginException("Your account has not yet been confirmed by the administrator. Please wait");
                    else
                        throw new InvalidLoginException("Your account has still been rejected by the administrator");
                } else
                    break;
        for (Buyer a : BuyerController.getBuyerList())
            if (a.getUsername().equals(username))
                if (a.getPassword().equals(password)) {
                    BuyerPanel.buyerPanel(a);
                    return;
                } else
                    break;
        throw new InvalidLoginException("incorrect username or password");
    }
}
