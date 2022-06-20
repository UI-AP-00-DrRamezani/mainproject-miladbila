package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.household.Refrigerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class RefrigeratorController {
    private static ArrayList<Refrigerator> refrigerators = new ArrayList<>();

    public static ArrayList<Refrigerator> getRefrigerators() {
        return refrigerators;
    }

    public static void setRefrigerators(Refrigerator refrigerator) {
        RefrigeratorController.refrigerators.add(refrigerator);
        writeRefrigerator(refrigerator);
    }
    public static void writeRefrigerator(Refrigerator refrigerator){
        FoldersController.createFolder("saved data\\products\\household\\refrigerators\\productsList\\refrigerator " + refrigerator.getID());
        File file = new File("saved data\\products\\household\\refrigerators\\productsList\\refrigerator " + refrigerator.getID() + "\\spec.txt");
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
        printWriter.println(refrigerator.getID());
        printWriter.println(refrigerator.getName());
        printWriter.println(refrigerator.getBrand());
        printWriter.println(refrigerator.getPrice());
        printWriter.println(refrigerator.getSeller().getUsername());
        printWriter.println(refrigerator.getInventory());
        printWriter.println(refrigerator.getExplanation());
        printWriter.println(refrigerator.getAverageScoreOfBuyers());
        printWriter.println(refrigerator.getConfirmStatus());
        printWriter.println(refrigerator.getEnergyConsumptionDegree());
        printWriter.println(refrigerator.isWarranty());
        printWriter.println(refrigerator.getCapacity());
        printWriter.println(refrigerator.getType());
        printWriter.println(refrigerator.isHaveFreezer());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + refrigerator.getSeller().getID() + "\\products list\\refrigerator " + refrigerator.getID());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\household\\refrigerators\\productsList\\refrigerator " + refrigerator.getID() + "\\spec.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + refrigerator.getSeller().getID() + "\\products list\\refrigerator " + refrigerator.getID() + "\\spec.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
