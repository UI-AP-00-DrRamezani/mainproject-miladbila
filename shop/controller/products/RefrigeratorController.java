package shop.controller.products;

import shop.entities.products.household.Refrigerator;

import java.util.ArrayList;

public class RefrigeratorController {
    private static ArrayList<Refrigerator> refrigerators = new ArrayList<>();

    public static ArrayList<Refrigerator> getRefrigerators() {
        return refrigerators;
    }

    public static void setRefrigerators(Refrigerator refrigerator) {
        RefrigeratorController.refrigerators.add(refrigerator);
    }
}
