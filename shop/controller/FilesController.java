package shop.controller;

import shop.controller.products.*;
import shop.entities.products.clothing.Dress;
import shop.entities.products.clothing.Shoes;
import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
import shop.entities.products.food.FoodProducts;
import shop.entities.products.household.Gaz;
import shop.entities.products.household.Refrigerator;
import shop.entities.products.household.TV;
import shop.roles.Buyer;
import shop.roles.Seller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesController {
    public static void readFiles() {
        readRefrigerator();
        readDresses();
        readFoods();
        readGaz();
        readLaptops();
        readMobiles();
        readShoes();
        readTV();
        readSellers();
        readBuyers();
    }

    private static void readMobiles() {
        File folder = new File("saved data\\products\\digital\\mobiles\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\digital\\mobiles\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            int storageCapacity = read.nextInt();
            int ramCapacity = read.nextInt();
            read.nextLine();
            String OS = read.nextLine();
            double weight = read.nextDouble();
            read.nextLine();
            String dimensions = read.nextLine();
            int simCount = read.nextInt();
            double camera = read.nextDouble();
            Mobile temp = new Mobile(ID, name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity,
                    OS, weight, dimensions, simCount, camera);
            MobileController.getMobiles().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getMobile().setProducts(temp);
        }
    }

    private static void readLaptops() {
        File folder = new File("saved data\\products\\digital\\laptops\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\digital\\laptops\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            int storageCapacity = read.nextInt();
            int ramCapacity = read.nextInt();
            read.nextLine();
            String OS = read.nextLine();
            double weight = read.nextDouble();
            read.nextLine();
            String dimensions = read.nextLine();
            String CPU = read.nextLine();
            boolean gaming = read.nextBoolean();
            Laptop temp = new Laptop(ID, name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity,
                    OS, weight, dimensions, CPU, gaming);
            LaptopController.getLaptops().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getLaptop().setProducts(temp);
        }
    }

    private static void readDresses() {
        File folder = new File("saved data\\products\\clothing\\dresses\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\clothing\\dresses\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            String producingCountry = read.nextLine();
            String material = read.nextLine();
            int size = read.nextInt();
            read.nextLine();
            String Type = read.nextLine();
            Dress temp = new Dress(ID, name, brand, price, seller, inventory, explanation, producingCountry, material,
                    size, Dress.ClothingType.valueOf(Type));
            DressController.getDresses().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getDress().setProducts(temp);
        }
    }

    private static void readShoes() {
        File folder = new File("saved data\\products\\clothing\\shoes\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\clothing\\shoes\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            String producingCountry = read.nextLine();
            String material = read.nextLine();
            int size = read.nextInt();
            read.nextLine();
            String Type = read.nextLine();
            Shoes temp = new Shoes(ID, name, brand, price, seller, inventory, explanation, producingCountry, material,
                    size, Shoes.ShoesType.valueOf(Type));
            ShoesController.getShoes().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getShoes().setProducts(temp);
        }
    }

    private static void readFoods() {
        File folder = new File("saved data\\products\\foods\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\foods\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            String productionDate = read.nextLine();
            String expirationDate = read.nextLine();
            FoodProducts temp = new FoodProducts(ID, name, brand, price, seller, inventory, explanation, productionDate, expirationDate);
            FoodController.getFoodProducts().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getFood().setProducts(temp);
        }
    }

    private static void readGaz() {
        File folder = new File("saved data\\products\\household\\gazes\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\household\\gazes\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            int energyConsumptionDegree = read.nextInt();
            boolean warranty = read.nextBoolean();
            int flameCount = read.nextInt();
            read.nextLine();
            String material = read.nextLine();
            boolean haveOven = read.nextBoolean();
            Gaz temp = new Gaz(ID, name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty, flameCount
                    , material, haveOven);
            GazController.getGazes().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getGaz().setProducts(temp);
        }
    }

    private static void readTV() {
        File folder = new File("saved data\\products\\household\\TVs\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\household\\TVs\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            int energyConsumptionDegree = read.nextInt();
            boolean warranty = read.nextBoolean();
            read.nextLine();
            String relocation = read.nextLine();
            double screenSize = read.nextDouble();
            TV temp = new TV(ID, name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty, relocation
                    , screenSize);
            TVController.getTVs().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getTV().setProducts(temp);
        }
    }

    private static void readRefrigerator() {
        File folder = new File("saved data\\products\\household\\refrigerators\\productsList");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\products\\household\\refrigerators\\productsList\\" + a + "\\spec.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String name = read.nextLine();
            String brand = read.nextLine();
            double price = read.nextDouble();
            read.nextLine();
            String sellerUser = read.nextLine();
            Seller seller = null;
            for (Seller b : SellerController.getSellerList())
                if (b.getUsername().equals(sellerUser)) {
                    seller = b;
                    break;
                }
            int inventory = read.nextInt();
            read.nextLine();
            String explanation = read.nextLine();
            int energyConsumptionDegree = read.nextInt();
            boolean warranty = read.nextBoolean();
            double capacity = read.nextDouble();
            read.nextLine();
            String type = read.nextLine();
            boolean haveFreezer = read.nextBoolean();
            Refrigerator temp = new Refrigerator(ID, name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty, capacity
                    , type, haveFreezer);
            RefrigeratorController.getRefrigerators().add(temp);
            ProductsController.setProducts(temp);
            seller.setProductsForSale(temp);
            CategoryController.getRefrigerator().setProducts(temp);
        }
    }

    private static void readSellers() {
        File folder = new File("saved data\\users\\sellers");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\users\\sellers\\" + a + "\\info.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String username = read.nextLine();
            String name = read.nextLine();
            String lastName = read.nextLine();
            String email = read.nextLine();
            String phoneNumber = read.nextLine();
            String password = read.nextLine();
            String companyName = read.nextLine();
            String companyEmail = read.nextLine();
            String accountStatus = read.nextLine();
            SellerController.getSellerList().add(new Seller(ID,username,name,lastName,email,Integer.parseInt(phoneNumber),
                    password,companyName,companyEmail,Seller.status.valueOf(accountStatus)));
        }
    }
    private static void readBuyers() {
        File folder = new File("saved data\\users\\buyers");
        String[] folders = folder.list();
        for (String a : folders) {
            File tempFile = new File("saved data\\users\\buyers\\" + a + "\\info.txt");
            Scanner read;
            try {
                read = new Scanner(tempFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int ID = read.nextInt();
            read.nextLine();
            String username = read.nextLine();
            String name = read.nextLine();
            String lastName = read.nextLine();
            String email = read.nextLine();
            String phoneNumber = read.nextLine();
            String password = read.nextLine();
            BuyerController.getBuyerList().add(new Buyer(ID,username,name,lastName,email,Integer.parseInt(phoneNumber),
                    password));
        }
    }
}

