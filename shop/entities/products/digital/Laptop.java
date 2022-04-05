package shop.entities.products.digital;

public class Laptop extends DigitalProducts {
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
