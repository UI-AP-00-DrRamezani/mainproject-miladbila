package shop.pages;

import shop.controller.LogInController;

import static shop.pages.Main.input;

public class LogIn {
    public static boolean loginStatus;

    public static void login() {
        while (true) {
            System.out.println("username:");
            String username = input.nextLine();
            System.out.println("password:");
            String password = input.nextLine();
            LogInController.login(username, password);
            if (loginStatus)
                break;
            else
                System.out.println("incorrect username of password");
        }
    }
}
