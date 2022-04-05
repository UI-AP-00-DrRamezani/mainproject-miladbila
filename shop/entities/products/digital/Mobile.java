package shop.entities.products.digital;

public class Mobile extends DigitalProducts {
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
