package shop.entities.products.household;

import shop.roles.Seller;

public class Gaz extends HouseholdProducts {
    int flameCount;
    String material;
    boolean haveOven;

    public Gaz(String name, String brand, double price, Seller seller, int inventory, String explanation,
               int energyConsumptionDegree, boolean warranty, int flameCount, String material, boolean haveOven) {
        super(name, brand, price, seller, inventory, explanation, energyConsumptionDegree, warranty);
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

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "Energy consumption degree: " +
                getEnergyConsumptionDegree() + "Warranty: " + isWarranty() + "Flame count: " + getFlameCount() +
                "Material: " + getMaterial() + "Oven: " + isHaveOven() + "\nexplanation:\n" + getExplanation();
    }
}
