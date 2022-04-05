package shop.entities.products.household;

public class Refrigerator extends HouseholdProducts {
    double capacity;
    String type;
    boolean haveFreezer;

    public Refrigerator(String name, String brand, double price, String sellers, int inventory, String explanation,
                        int energyConsumptionDegree, boolean warranty, double capacity, String type, boolean haveFreezer) {
        super(name, brand, price, sellers, inventory, explanation, energyConsumptionDegree, warranty);
        this.capacity = capacity;
        this.type = type;
        this.haveFreezer = haveFreezer;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHaveFreezer() {
        return haveFreezer;
    }

    public void setHaveFreezer(boolean haveFreezer) {
        this.haveFreezer = haveFreezer;
    }
}
