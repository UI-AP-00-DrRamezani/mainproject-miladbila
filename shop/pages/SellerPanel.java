package shop.pages;

import shop.controller.SellerPanelController;
import shop.roles.Seller;

import java.util.InputMismatchException;

import static shop.pages.Main.input;

public class SellerPanel {
    public static void sellerPanel(Seller seller) {
        while (true) {
            System.out.println("Welcome to seller panel\n\n");
            System.out.println("1. Change personal information");
            System.out.println("2. Adding new product");
            System.out.println("3. List of products for sale");
            System.out.println("4. Sales history list");
            System.out.println("5. Edit a product");
            System.out.println("6. Delete a product");
            System.out.println("7. Logout");
            int selectedNumber = 0;
            try {
                selectedNumber = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("input type mismatch");
            }
            input.nextLine();
            switch (selectedNumber) {
                case 1 -> changeInfo(seller);
                case 2 -> AddProduct.selectCategory(seller);
                case 3 -> showProductList(seller);
                case 4 -> SellerPanelController.saleHistoryList(seller);
                case 5 -> editProduct(seller);
                case 6 -> deleteProduct(seller);
                case 7 -> UserArea.userArea();
            }
        }
    }

    private static void changeInfo(Seller seller) {
        System.out.println("If you want to change each field, enter its value, otherwise leave it blank");
        System.out.println("name");
        String name = input.nextLine();
        if (!name.equals(""))
            seller.setName(name);
        System.out.println("last name");
        String lastName = input.nextLine();
        if (!lastName.equals(""))
            seller.setLastName(lastName);
        System.out.println("email");
        String email = input.nextLine();
        if (!email.equals(""))
            seller.setEmail(email);
        System.out.println("phone number");
        String phoneNumber = input.nextLine();
        if (!phoneNumber.equals(""))
            seller.setPhoneNumber(Integer.parseInt(phoneNumber));
        System.out.println("password");
        String password = input.nextLine();
        if (!password.equals(""))
            seller.setPassword(password);
        System.out.println("changing information successfully");
    }

    private static void showProductList(Seller seller) {
        SellerPanelController.productList(seller);
        System.out.println("Select product and for back press 0:");
        int n;
        try {
            n = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
            return;
        }
        input.nextLine();
        if (n == 0) {
            return;
        }
        SellerPanelController.selectProduct(n, seller);
    }

    private static void editProduct(Seller seller) {
        SellerPanelController.productList(seller);
        System.out.println("Select product and for back press 0:");
        int n;
        try {
            n = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
            return;
        }
        input.nextLine();
        if (n == 0) {
            return;
        }
        SellerPanelController.selectProduct(n, seller);
    }

    private static void deleteProduct(Seller seller) {
        SellerPanelController.productList(seller);
        System.out.println("Select product and for back press 0:");
        int n;
        try {
            n = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
            return;
        }
        input.nextLine();
        if (n == 0) {
            return;
        }
        System.out.println("If you want to change each field, enter its value, otherwise leave it blank");
        System.out.println("name");
        String name = input.nextLine();
        if (!name.equals(""))
            seller.getProductsForSale().get(n - 1).setName(name);
        System.out.println("brand");
        String brand = input.nextLine();
        if (!brand.equals(""))
            seller.getProductsForSale().get(n - 1).setBrand(brand);
        System.out.println("price");
        String price = input.nextLine();
        if (!price.equals(""))
            seller.getProductsForSale().get(n - 1).setPrice(Double.parseDouble(price));
        System.out.println("inventory");
        String inventory = input.nextLine();
        if (!inventory.equals(""))
            seller.getProductsForSale().get(n - 1).setInventory(Integer.parseInt(inventory));
        System.out.println("explanation");
        String explanation = input.nextLine();
        if (!explanation.equals(""))
            seller.getProductsForSale().get(n - 1).setExplanation(explanation);
        SellerPanelController.editProduct(n, seller);
        System.out.println("changing information successfully");
    }

}
