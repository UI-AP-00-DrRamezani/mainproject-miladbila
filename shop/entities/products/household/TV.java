package shop.entities.products.household;

public class TV extends HouseholdProducts {
    String relocation;
    double screenSize;

    public TV(String name, String brand, double price, String sellers, int inventory, String explanation,
              int energyConsumptionDegree, boolean warranty, String relocation, double screenSize) {
        super(name, brand, price, sellers, inventory, explanation, energyConsumptionDegree, warranty);
        this.relocation = relocation;
        this.screenSize = screenSize;
    }

    public String getRelocation() {
        return relocation;
    }

    public void setRelocation(String relocation) {
        this.relocation = relocation;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
