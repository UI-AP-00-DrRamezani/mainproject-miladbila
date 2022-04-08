package shop.pages;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Online Shop\n\n");
            System.out.println("1. UserArea");
            System.out.println("2. View products");
            System.out.println("3. Exit");
            Scanner input = new Scanner(System.in);
            int selectedNumber = input.nextInt();
            input.nextLine();
            switch (selectedNumber) {
                case 1:
                    UserArea.userArea();
                    break;
                case 2:
                    ShowProductList.selectCategory(null);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please select the correct option");
            }
        }
    }
}
