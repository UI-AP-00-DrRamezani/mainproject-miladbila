package shop.controller;

import shop.roles.Seller;

import java.util.ArrayList;

public class SellerController {
    private static ArrayList<Seller> sellerList = new ArrayList<>();

    public static ArrayList<Seller> getSellerList() {
        return sellerList;
    }

    public static void singUpSeller(String username, String name, String lastName, String email, int phoneNumber, String password,
                                    String companyName, String companyEmail) {
        sellerList.add(new Seller(username, name, lastName, email, phoneNumber, password, companyName, companyEmail));
    }
}
