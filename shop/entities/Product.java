package shop.entities;

import java.util.ArrayList;

abstract public class Product {
    private static int LAST_ID = 0;
    private final int ID;
    private String name;
    private String brand;
    private double price;
    private ArrayList<String> sellers = new ArrayList<String>();
    private int inventory;
    private String explanation;
    private int averageScoreOfBuyers;


    public Product(String name, String brand, double price, String sellers, int inventory, String explanation) {
        this.ID = LAST_ID++;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.sellers.add(sellers);
        this.inventory = inventory;
        this.explanation = explanation;
        this.averageScoreOfBuyers = 0;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getSellers() {
        return sellers;
    }

    public void setSellers(String sellers) {
        this.sellers.add(sellers);
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getAverageScoreOfBuyers() {
        return averageScoreOfBuyers;
    }

    public void setAverageScoreOfBuyers(int averageScoreOfBuyers) {
        this.averageScoreOfBuyers = averageScoreOfBuyers;
    }
}
