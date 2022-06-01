package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.digital.Laptop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class LaptopController {
    private static ArrayList<Laptop> laptops = new ArrayList<>();

    public static ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public static void setLaptops(Laptop laptop) {
        LaptopController.laptops.add(laptop);
        FoldersController.createFolder("saved data\\products\\digital\\laptops\\productsList\\laptop " + laptop.getID());
        File file = new File("saved data\\products\\digital\\laptops\\productsList\\laptop " + laptop.getID() + "\\spec.txt");
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
        printWriter.println(laptop.getID());
        printWriter.println(laptop.getName());
        printWriter.println(laptop.getBrand());
        printWriter.println(laptop.getPrice());
        printWriter.println(laptop.getSeller().getUsername());
        printWriter.println(laptop.getInventory());
        printWriter.println(laptop.getExplanation());
        printWriter.println(laptop.getAverageScoreOfBuyers());
        printWriter.println(laptop.getConfirmStatus());
        printWriter.println(laptop.getStorageCapacity());
        printWriter.println(laptop.getRamCapacity());
        printWriter.println(laptop.getOS());
        printWriter.println(laptop.getWeight());
        printWriter.println(laptop.getDimensions());
        printWriter.println(laptop.getCPU());
        printWriter.println(laptop.isGaming());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + laptop.getSeller().getID() + "\\products list\\dress " + laptop.getID());
        file1.mkdir();
        Path copied = Paths.get("saved data\\products\\digital\\laptops\\productsList\\laptop " + laptop.getID() + "\\spec.txt");
        Path originalPath = Paths.get("saved data\\users\\sellers\\seller " + laptop.getSeller().getID() + "\\products list\\dress " + laptop.getID());
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
