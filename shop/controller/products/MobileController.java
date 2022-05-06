package shop.controller.products;

import shop.entities.products.digital.Mobile;

import java.util.ArrayList;

public class MobileController {
    private static ArrayList<Mobile> mobiles = new ArrayList<>();

    public static ArrayList<Mobile> getMobiles() {
        return mobiles;
    }

    public static void setMobiles(Mobile mobile) {
        MobileController.mobiles.add(mobile);
    }
}
