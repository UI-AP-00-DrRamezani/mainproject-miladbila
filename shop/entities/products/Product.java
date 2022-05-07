package shop.entities.products;

import shop.entities.Discount;
import shop.roles.Seller;

import java.util.ArrayList;

abstract public class Product implements Comparable {
    private static int LAST_ID = 0;
    private final int ID;
    private String name;
    private String brand;
    private double price;
    private final Seller seller;
    private int inventory;
    private String explanation;
    private double averageScoreOfBuyers;
    private status confirmStatus = status.PENDING;
    private ArrayList<Discount> discountList = new ArrayList<>();

    public enum status {PENDING, CONFIRMED, REJECTED, DELETE_REQUEST, EDITED}

    public Product(String name, String brand, double price, Seller seller, int inventory, String explanation) {
        this.ID = LAST_ID++;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.seller = seller;
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

    public Seller getSeller() {
        return seller;
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

    public double getAverageScoreOfBuyers() {
        return averageScoreOfBuyers;
    }

    public void setAverageScoreOfBuyers(double averageScoreOfBuyers) {
        this.averageScoreOfBuyers = averageScoreOfBuyers;
    }


    public status getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(status confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public ArrayList<Discount> getDiscountList() {
        return discountList;
    }

    @Override
    public abstract int compareTo(Object o);
}
