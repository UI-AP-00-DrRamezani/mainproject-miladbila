package shop.controller;

import shop.roles.Buyer;
import shop.roles.Seller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SellerController {
    private static ArrayList<Seller> sellerList = new ArrayList<>();

    public static ArrayList<Seller> getSellerList() {
        return sellerList;
    }

    public static void singUpSeller(String username, String name, String lastName, String email, int phoneNumber, String password,
                                    String companyName, String companyEmail) {
        Seller temp = new Seller(username, name, lastName, email, phoneNumber, password, companyName, companyEmail);
        sellerList.add(temp);
        writeSeller(temp);
    }

    public static void writeSeller(Seller seller) {
        FoldersController.createFolder("saved data\\users\\sellers\\seller " + seller.getID());
        File file = new File("saved data\\users\\sellers\\seller " + seller.getID() + "\\info.txt");
        File file2 = new File("saved data\\users\\sellers\\seller " + seller.getID() + "\\products list");
        file2.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        printWriter.println(seller.getID());
        printWriter.println(seller.getUsername());
        printWriter.println(seller.getName());
        printWriter.println(seller.getLastName());
        printWriter.println(seller.getEmail());
        printWriter.println(seller.getPhoneNumber());
        printWriter.println(seller.getPassword());
        printWriter.println(seller.getCompanyName());
        printWriter.println(seller.getCompanyEmail());
        printWriter.println(seller.getAccountStatus());
        printWriter.close();
    }
}
