package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.clothing.Dress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class DressController {
    private static ArrayList<Dress> dresses = new ArrayList<>();

    public static ArrayList<Dress> getDresses() {
        return dresses;
    }

    public static void setDresses(Dress dress) {
        DressController.dresses.add(dress);
        writeDress(dress);
    }
    public static void writeDress(Dress dress){
        FoldersController.createFolder("saved data\\products\\clothing\\dresses\\productsList\\dress " + dress.getID());
        File file = new File("saved data\\products\\clothing\\dresses\\productsList\\dress " + dress.getID() + "\\spec.txt");
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
        printWriter.println(dress.getID());
        printWriter.println(dress.getName());
        printWriter.println(dress.getBrand());
        printWriter.println(dress.getPrice());
        printWriter.println(dress.getSeller().getUsername());
        printWriter.println(dress.getInventory());
        printWriter.println(dress.getExplanation());
        printWriter.println(dress.getAverageScoreOfBuyers());
        printWriter.println(dress.getConfirmStatus());
        printWriter.println(dress.getProducingCountry());
        printWriter.println(dress.getMaterial());
        printWriter.println(dress.getSize());
        printWriter.println(dress.getType());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + dress.getSeller().getID() + "\\products list\\dress " + dress.getID());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\clothing\\dresses\\productsList\\dress " + dress.getID() + "\\spec.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + dress.getSeller().getID() + "\\products list\\dress " + dress.getID() + "\\spec.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
