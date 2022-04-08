package shop.pages;

import static shop.pages.Main.input;

public class UserArea {
    public static void userArea() {
        System.out.println("1. login");
        System.out.println("2. sing up");
        int selectedNumber = input.nextInt();
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