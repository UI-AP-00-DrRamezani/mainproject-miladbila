package shop.controller;

import shop.pages.SignUpBuyer;
import shop.pages.SignUpSeller;

public class SignUpController {
    public static void buyer() {
        SignUpBuyer.signUp();
    }

    public static void seller() {
        SignUpSeller.signUp();
    }
}
