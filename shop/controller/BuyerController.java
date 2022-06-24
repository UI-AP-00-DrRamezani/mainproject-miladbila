package shop.controller;

import shop.roles.Buyer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BuyerController {
    private static ArrayList<Buyer> buyerList = new ArrayList<>();

    public static ArrayList<Buyer> getBuyerList() {
        return buyerList;
    }

    public static void singUpBuyer(String username, String name, String lastName, String email, int phoneNumber, String password) {
        Buyer temp=new Buyer(username, name, lastName, email, phoneNumber, password);
        buyerList.add(temp);
        writeBuyer(temp);
    }

    public static void writeBuyer(Buyer buyer){
        FoldersController.createFolder("saved data\\users\\buyers\\buyer " + buyer.getID());
        File file = new File("saved data\\users\\buyers\\buyer " + buyer.getID() + "\\info.txt");
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
        printWriter.println(buyer.getID());
        printWriter.println(buyer.getUsername());
        printWriter.println(buyer.getName());
        printWriter.println(buyer.getLastName());
        printWriter.println(buyer.getEmail());
        printWriter.println(buyer.getPhoneNumber());
        printWriter.println(buyer.getPassword());
        printWriter.println(buyer.getCredit());
    }

}
