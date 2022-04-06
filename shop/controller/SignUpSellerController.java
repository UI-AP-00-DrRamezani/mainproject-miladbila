package shop.controller;

import shop.pages.SignUpSeller;
import shop.roles.Seller;

public class SignUpSellerController {
    public static boolean availableUsername(String username) {
        for (Seller a : SellerController.getSellerList())
            if (a.getUsername().equals(username))
                return false;
        return true;
    }


    public static void singUpSeller(String username, String name, String lastName, String email, int phoneNumber,
                                    String password, String companyName, String companyEmail) {
        if (!availableUsername(username)) {
            SignUpSeller.signupStatus = "Username already taken, please enter another";
            return;
        }
        SellerController.singUpSeller(username, name, lastName, email, phoneNumber, password, companyName, companyEmail);
        SignUpSeller.signupStatus = "Your registration is complete";
    }
}
