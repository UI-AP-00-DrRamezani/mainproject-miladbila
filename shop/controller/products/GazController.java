package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.household.Gaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class GazController {
    private static ArrayList<Gaz> gazes = new ArrayList<>();

    public static ArrayList<Gaz> getGazes() {
        return gazes;
    }

    public static void setGazes(Gaz gaz) {
        GazController.gazes.add(gaz);
        FoldersController.createFolder("saved data\\products\\household\\gazes\\productsList\\gaz " + gaz.getID());
        File file = new File("saved data\\products\\household\\gazes\\productsList\\gaz " + gaz.getID() + "\\spec.txt");
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
        printWriter.println(gaz.getID());
        printWriter.println(gaz.getName());
        printWriter.println(gaz.getBrand());
        printWriter.println(gaz.getPrice());
        printWriter.println(gaz.getSeller().getUsername());
        printWriter.println(gaz.getInventory());
        printWriter.println(gaz.getExplanation());
        printWriter.println(gaz.getAverageScoreOfBuyers());
        printWriter.println(gaz.getConfirmStatus());
        printWriter.println(gaz.getEnergyConsumptionDegree());
        printWriter.println(gaz.isWarranty());
        printWriter.println(gaz.getFlameCount());
        printWriter.println(gaz.getMaterial());
        printWriter.println(gaz.isHaveOven());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + gaz.getSeller().getID() + "\\products list\\dress " + gaz.getID());
        file1.mkdir();
        Path copied = Paths.get("saved data\\products\\household\\gazes\\productsList\\gaz " + gaz.getID() + "\\spec.txt");
        Path originalPath = Paths.get("saved data\\users\\sellers\\seller " + gaz.getSeller().getID() + "\\products list\\dress " + gaz.getID());
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
