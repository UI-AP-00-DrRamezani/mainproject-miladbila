package shop.pages;

import shop.controller.SignUpBuyerController;
import shop.exception.UsernameTakenException;

import static shop.pages.Main.input;

public class SignUpBuyer {
    public static void signUp() {
        System.out.println("Please enter the requested information");
        System.out.println("Name");
        String name = input.nextLine();
        System.out.println("Last name");
        String lastname = input.nextLine();
        System.out.println("E-mail");
        String email = input.nextLine();
        System.out.println("Phone number");
        int phoneNumber = input.nextInt();
        System.out.println("Username");
        input.nextLine();
        String username = input.nextLine();
        System.out.println("Password");
        String password = input.nextLine();
        try {
            SignUpBuyerController.singUpBuyer(username, name, lastname, email, phoneNumber, password);
            System.out.println("Your registration is complete");
        } catch (UsernameTakenException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
