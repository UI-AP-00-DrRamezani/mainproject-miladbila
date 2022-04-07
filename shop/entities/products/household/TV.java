package shop.entities.products.household;

import shop.roles.Seller;

public class TV extends HouseholdProducts {
    String relocation;
    double screenSize;

    public TV(String name, String brand, double price, Seller seller, int inventory, String explanation,
              int energyConsumptionDegree, boolean warranty, String relocation, double screenSize) {
        super(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty);
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


    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "Energy consumption degree: " +
                getEnergyConsumptionDegree() + "Warranty: " + isWarranty() + "Relocation: " + getRelocation() +
                "Screen size: " + getScreenSize() + "\nexplanation:\n" + getExplanation();
    }
}
