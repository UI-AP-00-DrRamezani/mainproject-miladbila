package shop.pages;

import shop.controller.SignUpController;

import static shop.pages.Main.input;

public class SingUp {
    public static void singUp() {
        System.out.println("Please choose your role");
        System.out.println("1. Buyer");
        System.out.println("2. Seller");
        switch (input.nextInt()) {
            case 1 -> SignUpController.buyer();
            case 2 -> SignUpController.seller();
            default -> {
            }
        }
        input.nextLine();
    }
}
