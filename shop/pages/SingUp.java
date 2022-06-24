package shop.pages;

import shop.controller.SignUpController;

import java.util.InputMismatchException;

import static shop.pages.Main.input;

public class SingUp {
    public static void singUp() {
        System.out.println("Please choose your role");
        System.out.println("1. Buyer");
        System.out.println("2. Seller");
        int option = 0;
        try {
            option = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
        input.nextLine();
        switch (option) {
            case 1 -> SignUpController.buyer();
            case 2 -> SignUpController.seller();
        }
    }
}
