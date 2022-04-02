package shop.entities.products;

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
class Mobile extends DigitalProducts {
    private int simCount;
    private double camera;

    public Mobile(String name, String brand, double price, String sellers, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, int simCount, double camera) {
        super(name, brand, price, sellers, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
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
}

class Laptop extends DigitalProducts {
    private String CPU;
    private boolean isGaming;

    public Laptop(String name, String brand, double price, String sellers, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, String CPU, boolean isGaming) {
        super(name, brand, price, sellers, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
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
}

