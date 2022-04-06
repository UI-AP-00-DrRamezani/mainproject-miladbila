package shop.pages;

import shop.controller.SignUpSellerController;

import static shop.pages.Main.input;

public class SignUpSeller {
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
        System.out.println("Company name");
        String companyName = input.nextLine();
        System.out.println("Company E-mail");
        String companyEmail = input.nextLine();
        System.out.println("Password");
        String password = input.nextLine();
        SignUpSellerController.singUpSeller(username, name, lastname, email, phoneNumber, password, companyName, companyEmail);
        System.out.println(signupStatus);
        System.out.println("Please wait for the administrator to confirm your account");
    }
}
