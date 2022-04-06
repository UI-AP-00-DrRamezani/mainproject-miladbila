package shop.pages;

import shop.controller.AdminPanelController;
import shop.entities.products.Product;
import shop.roles.Admin;
import shop.roles.Seller;

import static shop.pages.Main.input;

public class AdminPanel {
    public static void adminPanel() {
        while (true) {
            System.out.println("Welcome to admin panel\n\n");
            System.out.println("1. Change personal information");
            System.out.println("2. View sellers registration requests");
            System.out.println("3. View product addition / editing requests");
            System.out.println("4. View the list of all users");
            System.out.println("5. Delete a user");
            System.out.println("6. View categories list");
            System.out.println("7. Logout");
            int selectedNumber = input.nextInt();
            switch (selectedNumber) {
                case 1:
                    changeInfo();
                    break;
                case 2:
                    sellersRegistrationRequests();
                    break;
                case 3:
                    changeProductStatus();
                    break;
                case 4:
                    usersList();
                    break;
                case 5:
                    deleteUser();
                    break;
                case 6:

                case 7:
                    return;
            }
        }
    }

    private static void changeProductStatus() {
        AdminPanelController.viewProducts();
        System.out.println("Enter number of product that you want change it status");
        int userIndex= input.nextInt();
        System.out.println("if you want confirm that product enter 1 otherwise enter 2");
        if (input.nextInt()==1)
            AdminPanelController.changeProductsStatus(userIndex, Product.status.CONFIRMED);
        else
            AdminPanelController.changeProductsStatus(userIndex, Product.status.REJECTED);
    }

    private static void sellersRegistrationRequests() {
        AdminPanelController.sellersList();
        System.out.println("Enter number of user that you want change his/her status");
        int userIndex= input.nextInt();
        System.out.println("if you want confirm that user enter 1 otherwise enter 2");
        if (input.nextInt()==1)
            AdminPanelController.changeSellerStatus(userIndex, Seller.status.CONFIRMED);
        else
            AdminPanelController.changeSellerStatus(userIndex, Seller.status.REJECTED);
    }

    private static void usersList() {
        System.out.println("Sellers:");
        AdminPanelController.sellersList();
        System.out.println("Buyers");
        AdminPanelController.buyerList();
    }

    private static void deleteUser() {
        System.out.println("What type user you want to delete?\n1. Seller\n2. Buyer");
        if (input.nextInt() == 1) {
            AdminPanelController.sellersList();
            System.out.println("Select user that you want to delete");
            AdminPanelController.deleteSeller(input.nextInt());
        } else {
            AdminPanelController.buyerList();
            System.out.println("Select user that you want to delete");
            AdminPanelController.deleteBuyer(input.nextInt());
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
        System.out.println("email");
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
