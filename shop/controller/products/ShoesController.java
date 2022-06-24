package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.clothing.Shoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ShoesController {
    private static ArrayList<Shoes> shoes = new ArrayList<>();

    public static ArrayList<Shoes> getShoes() {
        return shoes;
    }

    public static void setShoes(Shoes shoes) {
        ShoesController.shoes.add(shoes);
        writeShoes(shoes);
    }

    public static void writeShoes(Shoes shoes) {
        FoldersController.createFolder("saved data\\products\\clothing\\shoes\\productsList\\shoes " + shoes.getID());
        File file = new File("saved data\\products\\clothing\\shoes\\productsList\\shoes " + shoes.getID() + "\\spec.txt");
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
        printWriter.println(shoes.getID());
        printWriter.println(shoes.getName());
        printWriter.println(shoes.getBrand());
        printWriter.println(shoes.getPrice());
        printWriter.println(shoes.getSeller().getUsername());
        printWriter.println(shoes.getInventory());
        printWriter.println(shoes.getExplanation());
        printWriter.println(shoes.getAverageScoreOfBuyers());
        printWriter.println(shoes.getConfirmStatus());
        printWriter.println(shoes.getProducingCountry());
        printWriter.println(shoes.getMaterial());
        printWriter.println(shoes.getSize());
        printWriter.println(shoes.getType());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + shoes.getSeller().getID() + "\\products list\\shoes " + shoes.getID());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\clothing\\shoes\\productsList\\shoes " + shoes.getID() + "\\spec.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + shoes.getSeller().getID() + "\\products list\\shoes " + shoes.getID() + "\\spec.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
