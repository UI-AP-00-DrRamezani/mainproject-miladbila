package shop.entities;

import shop.entities.products.Product;

import java.util.ArrayList;

public class Category {
    private final String name;
    private final String attributes;
    private ArrayList<Product> products = new ArrayList<>();

    public Category(String name, String attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public String getAttributes() {
        return attributes;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products.add(products);
    }
}
