package shop.controller.products;

import shop.controller.FoldersController;
import shop.entities.products.digital.Mobile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MobileController {
    private static ArrayList<Mobile> mobiles = new ArrayList<>();

    public static ArrayList<Mobile> getMobiles() {
        return mobiles;
    }

    public static void setMobiles(Mobile mobile) {
        MobileController.mobiles.add(mobile);
        FoldersController.createFolder("saved data\\products\\digital\\mobiles\\productsList\\mobile " + mobile.getID());
        File file = new File("saved data\\products\\digital\\mobiles\\productsList\\mobile " + mobile.getID() + "\\spec.txt");
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
        printWriter.println(mobile.getID());
        printWriter.println(mobile.getName());
        printWriter.println(mobile.getBrand());
        printWriter.println(mobile.getPrice());
        printWriter.println(mobile.getSeller().getUsername());
        printWriter.println(mobile.getInventory());
        printWriter.println(mobile.getExplanation());
        printWriter.println(mobile.getAverageScoreOfBuyers());
        printWriter.println(mobile.getConfirmStatus());
        printWriter.println(mobile.getStorageCapacity());
        printWriter.println(mobile.getRamCapacity());
        printWriter.println(mobile.getOS());
        printWriter.println(mobile.getWeight());
        printWriter.println(mobile.getDimensions());
        printWriter.println(mobile.getSimCount());
        printWriter.println(mobile.getCamera());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + mobile.getSeller().getID() + "\\products list\\dress " + mobile.getID());
        file1.mkdir();
        Path copied = Paths.get("saved data\\products\\digital\\mobiles\\productsList\\mobile " + mobile.getID() + "\\spec.txt");
        Path originalPath = Paths.get("saved data\\users\\sellers\\seller " + mobile.getSeller().getID() + "\\products list\\dress " + mobile.getID());
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
