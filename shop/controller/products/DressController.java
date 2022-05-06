package shop.controller.products;

import shop.entities.products.clothing.Dress;

import java.util.ArrayList;

public class DressController {
    private static ArrayList<Dress> dresses = new ArrayList<>();

    public static ArrayList<Dress> getDresses() {
        return dresses;
    }

    public static void setDresses(Dress dress) {
        DressController.dresses.add(dress);
    }
}
