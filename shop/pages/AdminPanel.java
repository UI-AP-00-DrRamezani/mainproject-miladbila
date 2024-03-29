package shop.pages;

import shop.controller.AdminPanelController;
import shop.entities.products.Product;
import shop.roles.Admin;
import shop.roles.Seller;

import java.util.InputMismatchException;

import static shop.pages.Main.input;

public class AdminPanel {
    public static void adminPanel() {
        while (true) {
            System.out.println("Welcome to admin panel\n\n");
            System.out.println("1. Change personal information");
            System.out.println("2. View sellers registration requests");
            System.out.println("3. View product addition / editing requests");
            System.out.println("4. View product addition / editing requests");
            System.out.println("5. View the list of all users");
            System.out.println("6. Delete a user");
            System.out.println("7. View categories list");
            System.out.println("8. Logout");
            int selectedNumber = 0;
            try {
                selectedNumber = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("input type mismatch");
            }
            switch (selectedNumber) {
                case 1 -> changeInfo();
                case 2 -> sellersRegistrationRequests();
                case 3 -> changeProductStatus();
                case 4 -> deleteProduct();
                case 5 -> usersList();
                case 6 -> deleteUser();
                case 7 -> ShowProductList.selectCategory(null);
                case 8 -> UserArea.userArea();
            }
        }
    }

    private static void changeProductStatus() {
        AdminPanelController.viewProducts();
        System.out.println("Enter number of product that you want change it status");
        int userIndex = input.nextInt();
        System.out.println("if you want confirm that product enter 1 otherwise enter 2");
        if (input.nextInt() == 1)
            AdminPanelController.changeProductsStatus(userIndex, Product.status.CONFIRMED);
        else
            AdminPanelController.changeProductsStatus(userIndex, Product.status.REJECTED);
    }

    private static void deleteProduct() {
        AdminPanelController.viewProducts();
        System.out.println("Enter number of product that you want change it status");
        int userIndex;
        try {
            userIndex = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
            return;
        }
        System.out.println("if you want delete that product enter 1 otherwise enter 2");
        try {
            if (input.nextInt() == 1)
                AdminPanelController.deleteProduct(userIndex);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void sellersRegistrationRequests() {
        AdminPanelController.sellersList();
        System.out.println("Enter number of user that you want change his/her status");
        int userIndex;
        try {
            userIndex = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
            return;
        }
        System.out.println("if you want confirm that user enter 1 otherwise enter 2");
        try {
            if (input.nextInt() == 1)
                AdminPanelController.changeSellerStatus(userIndex, Seller.status.CONFIRMED);
            else
                AdminPanelController.changeSellerStatus(userIndex, Seller.status.REJECTED);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void usersList() {
        System.out.println("Sellers:");
        AdminPanelController.sellersList();
        System.out.println("Buyers");
        AdminPanelController.buyerList();
    }

    private static void deleteUser() {
        System.out.println("What type user you want to delete?\n1. Seller\n2. Buyer");
        try {
            if (input.nextInt() == 1) {
                AdminPanelController.sellersList();
                System.out.println("Select user that you want to delete");
                AdminPanelController.deleteSeller(input.nextInt());
            } else {
                AdminPanelController.buyerList();
                System.out.println("Select user that you want to delete");
                AdminPanelController.deleteBuyer(input.nextInt());
            }
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
        input.nextLine();

    }

    private static void changeInfo() {
        System.out.println("If you want to change each field, enter its value, otherwise leave it blank");
        System.out.println("name");
        String name = input.nextLine();
        if (!name.equals(""))
            Admin.getADMIN().setName(name);
        System.out.println("last name");
        String lastName = input.nextLine();
        if (!lastName.equals(""))
            Admin.getADMIN().setLastName(lastName);
        System.out.println("email");
        String email = input.nextLine();
        if (!email.equals(""))
            Admin.getADMIN().setEmail(email);
        System.out.println("phone number");
        String phoneNumber = input.nextLine();
        if (!phoneNumber.equals(""))
            Admin.getADMIN().setPhoneNumber(Integer.parseInt(phoneNumber));
        System.out.println("password");
        String password = input.nextLine();
        if (!email.equals(""))
            Admin.getADMIN().setPassword(password);
        System.out.println("changing information successfully");
    }
}
