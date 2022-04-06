package shop.controller.products;

import shop.entities.products.digital.Laptop;

import java.util.ArrayList;

public class LaptopController {
    private static ArrayList<Laptop> laptops = new ArrayList<>();

    public static ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public static void setLaptops(Laptop laptop) {
        LaptopController.laptops.add(laptop);
    }
}
