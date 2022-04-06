package shop.controller.products;

import shop.entities.products.household.TV;

import java.util.ArrayList;

public class TVController {
    private static ArrayList<TV> TVs = new ArrayList<>();

    public static ArrayList<TV> getTVs() {
        return TVs;
    }

    public static void setTV(TV TV) {
        TVController.TVs.add(TV);
    }
}
