package shop.controller.products;

import shop.entities.products.food.FoodProducts;

import java.util.ArrayList;

public class FoodController {
    private static ArrayList<FoodProducts> foodProducts = new ArrayList<>();

    public static ArrayList<FoodProducts> getFoodProducts() {
        return foodProducts;
    }

    public static void setFoodProducts(FoodProducts foodProduct) {
        FoodController.foodProducts.add(foodProduct);
    }
}
