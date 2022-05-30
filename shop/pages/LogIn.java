package shop.pages;

import shop.controller.LogInController;
import shop.exception.UsernameTakenException;

import static shop.pages.Main.input;

public class LogIn {
    public static void login() {
        while (true) {
            System.out.println("username:");
            String username = input.nextLine();
            System.out.println("password:");
            String password = input.nextLine();
            try {
                LogInController.login(username, password);
                break;
            } catch (UsernameTakenException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
