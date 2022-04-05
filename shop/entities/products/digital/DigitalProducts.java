package shop.entities.products.digital;

import shop.entities.products.Product;

abstract public class DigitalProducts extends Product {
    private double storageCapacity;
    private double ramCapacity;
    private String OS;
    private double weight;
    private String dimensions;

    public DigitalProducts(String name, String brand, double price, String sellers, int inventory, String explanation,
                           double storageCapacity, double ramCapacity, String OS, double weight, String dimensions) {
        super(name, brand, price, sellers, inventory, explanation);
        this.storageCapacity = storageCapacity;
        this.ramCapacity = ramCapacity;
        this.OS = OS;
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(double ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}

