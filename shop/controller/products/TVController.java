package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.household.TV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class TVController {
    private static ArrayList<TV> TVs = new ArrayList<>();

    public static ArrayList<TV> getTVs() {
        return TVs;
    }

    public static void setTV(TV TV) {
        TVController.TVs.add(TV);
        FoldersController.createFolder("saved data\\products\\household\\TVs\\productsList\\TV " + TV.getID());
        File file = new File("saved data\\products\\household\\TVs\\productsList\\TV " + TV.getID() + "\\spec.txt");
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
        printWriter.println(TV.getID());
        printWriter.println(TV.getName());
        printWriter.println(TV.getBrand());
        printWriter.println(TV.getPrice());
        printWriter.println(TV.getSeller().getUsername());
        printWriter.println(TV.getInventory());
        printWriter.println(TV.getExplanation());
        printWriter.println(TV.getAverageScoreOfBuyers());
        printWriter.println(TV.getConfirmStatus());
        printWriter.println(TV.getEnergyConsumptionDegree());
        printWriter.println(TV.isWarranty());
        printWriter.println(TV.getRelocation());
        printWriter.println(TV.getScreenSize());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + TV.getSeller().getID() + "\\products list\\dress " + TV.getID());
        file1.mkdir();
        Path copied = Paths.get("saved data\\products\\household\\TVs\\productsList\\TV " + TV.getID() + "\\spec.txt");
        Path originalPath = Paths.get("saved data\\users\\sellers\\seller " + TV.getSeller().getID() + "\\products list\\dress " + TV.getID());
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
