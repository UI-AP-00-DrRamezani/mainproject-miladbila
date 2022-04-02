package shop.entities.products;

abstract public class HouseholdProducts extends Product {
    int energyConsumptionDegree;
    boolean warranty;

    public HouseholdProducts(String name, String brand, double price, String sellers, int inventory, String explanation,
                             int energyConsumptionDegree, boolean warranty) {
        super(name, brand, price, sellers, inventory, explanation);
        this.energyConsumptionDegree = energyConsumptionDegree;
        this.warranty = warranty;
    }

    public int getEnergyConsumptionDegree() {
        return energyConsumptionDegree;
    }

    public void setEnergyConsumptionDegree(int energyConsumptionDegree) {
        this.energyConsumptionDegree = energyConsumptionDegree;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
}

class TV extends HouseholdProducts {
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

class Refrigerator extends HouseholdProducts {
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

class Gaz extends HouseholdProducts {
    int flameCount;
    String material;
    boolean haveOven;

    public Gaz(String name, String brand, double price, String sellers, int inventory, String explanation,
               int energyConsumptionDegree, boolean warranty, int flameCount, String material, boolean haveOven) {
        super(name, brand, price, sellers, inventory, explanation, energyConsumptionDegree, warranty);
        this.flameCount = flameCount;
        this.material = material;
        this.haveOven = haveOven;
    }

    public int getFlameCount() {
        return flameCount;
    }

    public void setFlameCount(int flameCount) {
        this.flameCount = flameCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHaveOven() {
        return haveOven;
    }

    public void setHaveOven(boolean haveOven) {
        this.haveOven = haveOven;
    }
}