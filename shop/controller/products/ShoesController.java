package shop.controller.products;

import shop.entities.products.clothing.Shoes;

import java.util.ArrayList;

public class ShoesController {
    private static ArrayList<Shoes> shoes = new ArrayList<>();

    public static ArrayList<Shoes> getShoes() {
        return shoes;
    }

    public static void setShoes(Shoes shoes) {
        ShoesController.shoes.add(shoes);
    }
}
