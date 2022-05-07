package shop.entities.products.digital;

import shop.entities.DiscountOption;
import shop.entities.WarrantyOption;
import shop.entities.products.Product;
import shop.roles.Seller;

abstract public class DigitalProducts extends Product implements WarrantyOption, DiscountOption {
    private double storageCapacity;
    private double ramCapacity;
    private String OS;
    private double weight;
    private String dimensions;

    public DigitalProducts(String name, String brand, double price, Seller seller, int inventory, String explanation,
                           double storageCapacity, double ramCapacity, String OS, double weight, String dimensions) {
        super(name, brand, price, seller, inventory, explanation);
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

    @Override
    public Double calculateGuaranteeValue() {
        return getPrice() * 0.5;
    }

    @Override
    public int calculateGuaranteeTime() {
        return (int) (ramCapacity * 10 + weight);
    }
}

