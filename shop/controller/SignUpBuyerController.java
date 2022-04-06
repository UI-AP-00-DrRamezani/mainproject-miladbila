package shop.controller;

import shop.pages.SignUpBuyer;
import shop.roles.Buyer;

public class SignUpBuyerController {
    public static boolean availableUsername(String username) {
        for (Buyer a : BuyerController.getBuyerList())
            if (a.getUsername().equals(username))
                return false;
        return true;
    }

    public static void singUpBuyer(String username, String name, String lastName, String email, int phoneNumber, String password) {
        if (!availableUsername(username)) {
            SignUpBuyer.signupStatus = "Username already taken, please enter another";
            return;
        }
        BuyerController.singUpBuyer(username, name, lastName, email, phoneNumber, password);
        SignUpBuyer.signupStatus = "Your registration is complete";
    }
}
