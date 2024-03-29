package shop.pages;

import shop.controller.FilesController;
import shop.controller.FoldersController;
import shop.entities.products.digital.DigitalProducts;
import shop.entities.products.digital.Mobile;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        FoldersController.checkFolders();
        FilesController.readFiles();
        System.out.println(Mobile.class);
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
