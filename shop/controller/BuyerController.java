package shop.controller;

import shop.roles.Buyer;

import java.util.ArrayList;

public class BuyerController {
    private static ArrayList<Buyer> buyerList = new ArrayList<>();

    public static ArrayList<Buyer> getBuyerList() {
        return buyerList;
    }

    public static void singUpBuyer(String username, String name, String lastName, String email, int phoneNumber, String password) {
        buyerList.add(new Buyer(username, name, lastName, email, phoneNumber, password));
    }


}
