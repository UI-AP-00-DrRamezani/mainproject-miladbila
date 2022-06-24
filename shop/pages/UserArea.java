package shop.pages;

import java.util.InputMismatchException;

import static shop.pages.Main.input;

public class UserArea {
    public static void userArea() {
        System.out.println("1. login");
        System.out.println("2. sing up");
        int selectedNumber = 0;
        try {
            selectedNumber = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
        input.nextLine();
        switch (selectedNumber) {
            case 1:
                LogIn.login();
                break;
            case 2:
                SingUp.singUp();
                break;
        }
    }
}