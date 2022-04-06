package shop.pages;

import shop.controller.SignUpBuyerController;

import static shop.pages.Main.input;

public class SignUpBuyer {
    public static String signupStatus;

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
        SignUpBuyerController.singUpBuyer(username, name, lastname, email, phoneNumber, password);
        System.out.println(signupStatus);
    }
}
