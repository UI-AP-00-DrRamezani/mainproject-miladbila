package shop.entities.products.household;

import shop.entities.products.clothing.Dress;
import shop.entities.products.clothing.Shoes;
import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
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

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile || o instanceof Laptop || o instanceof Dress || o instanceof Shoes)
            return -1;
        else if (o instanceof Gaz)
            if (this.getName().compareTo(((Gaz) o).getName()) == 0)
                if (this.flameCount > ((Gaz) o).getFlameCount())
                    return 1;
                else if (this.flameCount < ((Gaz) o).getFlameCount())
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((Gaz) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((Gaz) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice() > ((Gaz) o).getPrice())
                    return 1;
                else if (this.getPrice() < ((Gaz) o).getPrice())
                    return -1;
                else if (this.getInventory() > 0 && ((Gaz) o).getInventory() < 1)
                    return 1;
                else if (this.getInventory() < 1 && ((Gaz) o).getInventory() > 0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((Gaz) o).getName());
        else
            return 1;
    }

    @Override
    public int calculateGuaranteeTime() {
        if (warranty)
            return (int) (flameCount * 2 + getPrice());
        return 0;
    }
}
