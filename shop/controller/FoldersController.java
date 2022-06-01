package shop.controller;

import java.io.File;

public class FoldersController {
    public static void checkFolders() {
        createFolder("saved data");
        createFolder("saved data\\users");
        createFolder("saved data\\users\\sellers");
        createFolder("saved data\\users\\buyers");
        createFolder("saved data\\users\\admin");
        createFolder("saved data\\products");
        createFolder("saved data\\products\\digital");
        createFolder("saved data\\products\\digital\\mobiles");
        createFolder("saved data\\products\\digital\\mobiles\\productsList");
        createFolder("saved data\\products\\digital\\laptops");
        createFolder("saved data\\products\\digital\\laptops\\productsList");
        createFolder("saved data\\products\\foods");
        createFolder("saved data\\products\\foods\\productsList");
        createFolder("saved data\\products\\household");
        createFolder("saved data\\products\\household\\gazes");
        createFolder("saved data\\products\\household\\gazes\\productsList");
        createFolder("saved data\\products\\household\\refrigerators");
        createFolder("saved data\\products\\household\\refrigerators\\productsList");
        createFolder("saved data\\products\\household\\TVs");
        createFolder("saved data\\products\\household\\TVs\\productsList");
        createFolder("saved data\\products\\clothing");
        createFolder("saved data\\products\\clothing\\shoes");
        createFolder("saved data\\products\\clothing\\shoes\\productsList");
        createFolder("saved data\\products\\clothing\\dresses");
        createFolder("saved data\\products\\clothing\\dresses\\productsList");
    }

    public static void createFolder(String path) {
        File folder = new File(path);
        if (!folder.exists())
            folder.mkdir();
    }
}
