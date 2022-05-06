package shop.entities.products.digital;

import shop.roles.Seller;

public class Laptop extends DigitalProducts {
    private String CPU;
    private boolean isGaming;

    public Laptop(String name, String brand, double price, Seller seller, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, String CPU, boolean isGaming) {
        super(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
        this.CPU = CPU;
        this.isGaming = isGaming;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public boolean isGaming() {
        return isGaming;
    }

    public void setGaming(boolean gaming) {
        isGaming = gaming;
    }

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "\nStorage capacity: " + getStorageCapacity()
                + "\nRam capacity: " + getRamCapacity() + "\nOS: " + getOS() + "\nweight" + getWeight() + "\ndimensions" +
                getDimensions() + "\nCPU: " + getCPU() + "\ngaming" + isGaming() + "\nexplanation:\n" + getExplanation();
    }
}
