package shop.entities.products.household;

import shop.entities.products.Product;

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

