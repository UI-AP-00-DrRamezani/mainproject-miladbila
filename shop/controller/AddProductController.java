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
import shop.roles.Seller;

public class AddProductController {
    public static void addMobile(String name, String brand, double price, Seller seller, int inventory,
                                 String explanation, double storageCapacity, double ramCapacity, String OS,
                                 double weight, String dimensions, int simCount, double camera) {
        Mobile temp = new Mobile(name, brand, price, seller, inventory, explanation, storageCapacity,
                ramCapacity, OS, weight, dimensions, simCount, camera);
        MobileController.setMobiles(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getMobile().setProducts(temp);
    }

    public static void addLaptop(String name, String brand, double price, Seller seller, int inventory,
                                 String explanation, double storageCapacity, double ramCapacity, String OS,
                                 double weight, String dimensions, String CPU, boolean isGaming) {
        Laptop temp = new Laptop(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity, OS,
                weight, dimensions, CPU, isGaming);
        LaptopController.setLaptops(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getLaptop().setProducts(temp);
    }

    public static void addDress(String name, String brand, double price, Seller seller, int inventory, String explanation,
                                String producingCountry, String material, int size, Dress.ClothingType type) {
        Dress temp = new Dress(name, brand, price, seller, inventory, explanation, producingCountry, material, size, type);
        DressController.setDresses(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getDress().setProducts(temp);
    }

    public static void addShoes(String name, String brand, double price, Seller seller, int inventory, String explanation,
                                String producingCountry, String material, int size, Shoes.ShoesType type) {
        Shoes temp = new Shoes(name, brand, price, seller, inventory, explanation, producingCountry, material, size, type);
        ShoesController.setShoes(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getShoes().setProducts(temp);
    }

    public static void addGaz(String name, String brand, double price, Seller seller, int inventory, String explanation,
                              int energyConsumptionDegree, boolean warranty, int flameCount, String material, boolean haveOven) {
        Gaz temp = new Gaz(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty, flameCount, material, haveOven);
        GazController.setGazes(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getGaz().setProducts(temp);
    }

    public static void addTV(String name, String brand, double price, Seller seller, int inventory, String explanation,
                             int energyConsumptionDegree, boolean warranty, String relocation, double screenSize) {
        TV temp = new TV(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty, relocation, screenSize);
        TVController.setTV(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getTV().setProducts(temp);
    }

    public static void addRefrigerator(String name, String brand, double price, Seller seller, int inventory, String explanation,
                                       int energyConsumptionDegree, boolean warranty, double capacity, String type, boolean haveFreezer) {
        Refrigerator temp = new Refrigerator(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty, capacity, type, haveFreezer);
        RefrigeratorController.setRefrigerators(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getRefrigerator().setProducts(temp);
    }

    public static void addFood(String name, String brand, double price, Seller seller, int inventory, String explanation,
                               String productionDate, String expirationDate) {
        FoodProducts temp = new FoodProducts(name, brand, price, seller, inventory, explanation, productionDate, expirationDate);
        FoodController.setFoodProducts(temp);
        ProductsController.setProducts(temp);
        seller.setProductsForSale(temp);
        CategoryController.getFood().setProducts(temp);
    }
}
