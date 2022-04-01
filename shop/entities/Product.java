package shop.entities;

import java.util.ArrayList;

abstract public class Product {
    private int ID;
    private String name;
    private String brand;
    private double price;
    private ArrayList<String> sellers = new ArrayList<String>();
    private int inventory;
    private String explanation;
    private int averageScoreOfBuyers;

}
