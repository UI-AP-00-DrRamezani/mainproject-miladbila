package shop.entities.products.digital;

import shop.roles.Seller;

public class Mobile extends DigitalProducts {
    private int simCount;
    private double camera;

    public Mobile(String name, String brand, double price, Seller seller, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, int simCount, double camera) {
        super(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
        this.simCount = simCount;
        this.camera = camera;
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "\nStorage capacity: " + getStorageCapacity()
                + "\nRam capacity: " + getRamCapacity() + "\nOS: " + getOS() + "\nweight" + getWeight() + "\ndimensions" +
                getDimensions() + "\nSim card count: " + getSimCount() + "\nCamera: " + getCamera() + "\nexplanation:\n" + getExplanation();
    }
}
