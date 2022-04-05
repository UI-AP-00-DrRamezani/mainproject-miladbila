package shop.entities.products.household;

import shop.entities.products.Product;
import shop.roles.Seller;

abstract public class HouseholdProducts extends Product {
    int energyConsumptionDegree;
    boolean warranty;

    public HouseholdProducts(String name, String brand, double price, Seller seller, int inventory, String explanation,
                             int energyConsumptionDegree, boolean warranty) {
        super(name, brand, price, seller, inventory, explanation);
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

