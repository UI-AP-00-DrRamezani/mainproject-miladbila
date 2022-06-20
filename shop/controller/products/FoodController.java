package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.food.FoodProducts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FoodController {
    private static ArrayList<FoodProducts> foodProducts = new ArrayList<>();

    public static ArrayList<FoodProducts> getFoodProducts() {
        return foodProducts;
    }

    public static void setFoodProducts(FoodProducts foodProduct) {
        FoodController.foodProducts.add(foodProduct);
        writeFood(foodProduct);
    }
    public static void writeFood(FoodProducts foodProduct){
        FoldersController.createFolder("saved data\\products\\foods\\productsList\\food " + foodProduct.getID());
        File file = new File("saved data\\products\\foods\\productsList\\food " + foodProduct.getID() + "\\spec.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        printWriter.println(foodProduct.getID());
        printWriter.println(foodProduct.getName());
        printWriter.println(foodProduct.getBrand());
        printWriter.println(foodProduct.getPrice());
        printWriter.println(foodProduct.getSeller().getUsername());
        printWriter.println(foodProduct.getInventory());
        printWriter.println(foodProduct.getExplanation());
        printWriter.println(foodProduct.getAverageScoreOfBuyers());
        printWriter.println(foodProduct.getConfirmStatus());
        printWriter.println(foodProduct.getExpirationDate());
        printWriter.println(foodProduct.getProductionDate());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + foodProduct.getSeller().getID() + "\\products list\\food " + foodProduct.getID());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\foods\\productsList\\food " + foodProduct.getID() + "\\spec.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + foodProduct.getSeller().getID() + "\\products list\\food " + foodProduct.getID() + "\\spec.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
