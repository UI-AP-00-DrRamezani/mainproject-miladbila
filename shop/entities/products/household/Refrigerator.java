package shop.entities.products.household;

import shop.roles.Seller;

public class Refrigerator extends HouseholdProducts {
    double capacity;
    String type;
    boolean haveFreezer;

    public Refrigerator(String name, String brand, double price, Seller seller, int inventory, String explanation,
                        int energyConsumptionDegree, boolean warranty, double capacity, String type, boolean haveFreezer) {
        super(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty);
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

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "Energy consumption degree: " +
                getEnergyConsumptionDegree() + "Warranty: " + isWarranty() + "Capacity: " + getCapacity() +
                "Type: " + getType() + "ّFreezer: " + haveFreezer + "\nexplanation:\n" + getExplanation();
    }
}
