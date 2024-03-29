package shop.pages;

import shop.controller.AddProductController;
import shop.entities.products.clothing.Dress;
import shop.entities.products.clothing.Shoes;
import shop.roles.Seller;

import java.util.InputMismatchException;

import static shop.pages.Main.input;

public class AddProduct {
    public static void selectCategory(Seller seller) {
        System.out.println("Select the product you want to create:");
        System.out.println("Digital Product");
        System.out.println("    1. Mobile");
        System.out.println("    2. Laptop");
        System.out.println("Clothing Product");
        System.out.println("    3. Dress");
        System.out.println("    4. Shoes");
        System.out.println("Household Product");
        System.out.println("    5. Gaz");
        System.out.println("    6. TV");
        System.out.println("    7. Refrigerator");
        System.out.println("Food Product");
        System.out.println("    8. Food");
        int n = 0;
        try {
            n = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
        input.nextLine();
        switch (n) {
            case 1 -> addMobile(seller);
            case 2 -> addLaptop(seller);
            case 3 -> addDress(seller);
            case 4 -> addShoes(seller);
            case 5 -> addGaz(seller);
            case 6 -> addTV(seller);
            case 7 -> addRefrigerator(seller);
            case 8 -> addFood(seller);
        }
    }

    private static void addMobile(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Storage Capacity:");
            int storageCapacity = input.nextInt();
            System.out.println("Ram Capacity:");
            int ramCapacity = input.nextInt();
            input.nextLine();
            System.out.println("OS:");
            String OS = input.nextLine();
            System.out.println("Weight:");
            double weight = input.nextDouble();
            input.nextLine();
            System.out.println("Dimensions:");
            String dimensions = input.nextLine();
            System.out.println("Sim card count:");
            int simCount = input.nextInt();
            System.out.println("Camera:");
            double camera = input.nextDouble();
            input.nextLine();
            AddProductController.addMobile(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity,
                    OS, weight, dimensions, simCount, camera);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addLaptop(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Storage Capacity:");
            int storageCapacity = input.nextInt();
            System.out.println("Ram Capacity:");
            int ramCapacity = input.nextInt();
            input.nextLine();
            System.out.println("OS:");
            String OS = input.nextLine();
            System.out.println("Weight:");
            double weight = input.nextDouble();
            input.nextLine();
            System.out.println("Dimensions:");
            String dimensions = input.nextLine();
            System.out.println("CPU:");
            String CPU = input.nextLine();
            System.out.println("Is that laptop gaming?(y/n)");
            boolean isGaming = input.nextLine().equals("y");
            input.nextLine();
            AddProductController.addLaptop(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity,
                    OS, weight, dimensions, CPU, isGaming);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addDress(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Producing Country:");
            String producingCountry = input.nextLine();
            System.out.println("Material:");
            String material = input.nextLine();
            System.out.println("Size:");
            int size = input.nextInt();
            System.out.println("Type:\n1. shirt\n2. pants");
            Dress.ClothingType type;
            if (input.nextInt() == 1)
                type = Dress.ClothingType.shirt;
            else
                type = Dress.ClothingType.pants;
            input.nextLine();
            AddProductController.addDress(name, brand, price, seller, inventory, explanation, producingCountry, material, size, type);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addShoes(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Producing Country:");
            String producingCountry = input.nextLine();
            System.out.println("Material:");
            String material = input.nextLine();
            System.out.println("Size:");
            int size = input.nextInt();
            System.out.println("Type:\n1. boot\n2. sport\n3. formal");
            Shoes.ShoesType type;
            if (input.nextInt() == 1)
                type = Shoes.ShoesType.boot;
            else if (input.nextInt() == 2)
                type = Shoes.ShoesType.sport;
            else
                type = Shoes.ShoesType.formal;
            input.nextLine();
            AddProductController.addShoes(name, brand, price, seller, inventory, explanation, producingCountry, material, size, type);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addGaz(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Energy Consumption Degree:");
            int energyConsumptionDegree = input.nextInt();
            input.nextLine();
            System.out.println("Warranty(y/n)");
            boolean warranty = input.nextLine().equals("y");
            System.out.println("Flame count:");
            int flameCount = input.nextInt();
            input.nextLine();
            System.out.println("Material:");
            String material = input.nextLine();
            System.out.println("Is gaz have oven(y/n)");
            boolean haveOven = input.nextLine().equals("y");
            AddProductController.addGaz(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty
                    , flameCount, material, haveOven);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addTV(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Energy Consumption Degree:");
            int energyConsumptionDegree = input.nextInt();
            input.nextLine();
            System.out.println("Warranty(y/n)");
            boolean warranty = input.nextLine().equals("y");
            System.out.println("Relocation:");
            String relocation = input.nextLine();
            System.out.println("Screen Size:");
            double screenSize = input.nextDouble();
            input.nextLine();
            AddProductController.addTV(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty
                    , relocation, screenSize);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addRefrigerator(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Energy Consumption Degree:");
            int energyConsumptionDegree = input.nextInt();
            input.nextLine();
            System.out.println("Warranty(y/n)");
            boolean warranty = input.nextLine().equals("y");
            System.out.println("Capacity:");
            double capacity = input.nextDouble();
            input.nextLine();
            System.out.println("Type:");
            String type = input.nextLine();
            System.out.println("Is refrigerator have freezer(y/n)");
            boolean haveFreezer = input.nextLine().equals("y");
            AddProductController.addRefrigerator(name, brand, price, seller, inventory, explanation, energyConsumptionDegree,
                    warranty, capacity, type, haveFreezer);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

    private static void addFood(Seller seller) {
        try {
            System.out.println("Please enter the requested information");
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Brand:");
            String brand = input.nextLine();
            System.out.println("Price:");
            double price = input.nextDouble();
            System.out.println("Inventory:");
            int inventory = input.nextInt();
            input.nextLine();
            System.out.println("Product Explanation:");
            String explanation = input.nextLine();
            System.out.println("Production Date");
            String productionDate = input.nextLine();
            System.out.println("Expiration Date");
            String expirationDate = input.nextLine();
            AddProductController.addFood(name, brand, price, seller, inventory, explanation, productionDate, expirationDate);
        } catch (InputMismatchException ex) {
            System.out.println("input type mismatch");
        }
    }

}
