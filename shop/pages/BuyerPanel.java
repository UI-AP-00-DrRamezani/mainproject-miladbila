package shop.pages;

import shop.controller.BuyerPanelController;
import shop.exception.InvalidEmail;
import shop.exception.InvalidPhoneNumberException;
import shop.exception.InvalidPurchaseException;
import shop.roles.Buyer;

import java.util.InputMismatchException;

import static shop.pages.Main.input;

public class BuyerPanel {
    public static void buyerPanel(Buyer buyer) {
        while (true) {
            System.out.println("Welcome to seller panel\n\n");
            System.out.println("1. Change personal information");
            System.out.println("2. See products");
            System.out.println("3. Cart");
            System.out.println("4. Purchase history list");
            System.out.println("5. Increase credit");
            System.out.println("6. Logout");
            int selectedNumber = 0;
            try {
                selectedNumber = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("input type mismatch");
            }
            input.nextLine();
            switch (selectedNumber) {
                case 1 -> changeInfo(buyer);
                case 2 -> ShowProductList.selectCategory(buyer);
                case 3 -> cart(buyer);
                case 4 -> BuyerPanelController.purchaseHistory(buyer);
                case 5 -> increaseCredit(buyer);
                case 6 -> UserArea.userArea();
            }
        }
    }

    private static void changeInfo(Buyer buyer) {
        System.out.println("If you want to change each field, enter its value, otherwise leave it blank");
        System.out.println("name");
        String name = input.nextLine();
        if (!name.equals(""))
            buyer.setName(name);
        System.out.println("last name");
        String lastName = input.nextLine();
        if (!lastName.equals(""))
            buyer.setLastName(lastName);
        System.out.println("email");
        String email = input.nextLine();
        if (!email.equals(""))
            try {
                buyer.setEmail(email);
            } catch (InvalidEmail ex) {
                System.out.println(ex.getMessage());
            }
        System.out.println("phone number");
        String phoneNumber = input.nextLine();
        if (!phoneNumber.equals(""))
            try {
                buyer.setPhoneNumber(Integer.parseInt(phoneNumber));
            } catch (InvalidPhoneNumberException ex) {
                System.out.println(ex.getMessage());
            }
        System.out.println("password");
        String password = input.nextLine();
        if (!email.equals(""))
            buyer.setPassword(password);
        System.out.println("changing information successfully");
    }

    private static void increaseCredit(Buyer buyer) {
        double amount;
        try {
            amount = input.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
            return;
        }
        input.nextLine();
        BuyerPanelController.increaseCredit(buyer, amount);
    }

    private static void cart(Buyer buyer) {
        BuyerPanelController.cartProducts(buyer);
        System.out.println("If you want the purchase to be complete, enter 1");
        if (input.nextLine().equals("1")) {
            System.out.println();
            try {
                BuyerPanelController.purchase(buyer);
            } catch (InvalidPurchaseException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
