package shop.controller.products;

import shop.entities.products.household.Gaz;

import java.util.ArrayList;

public class GazController {
    private static ArrayList<Gaz> gazes = new ArrayList<>();

    public static ArrayList<Gaz> getGazes() {
        return gazes;
    }

    public static void setGazes(Gaz gaz) {
        GazController.gazes.add(gaz);
    }
}
