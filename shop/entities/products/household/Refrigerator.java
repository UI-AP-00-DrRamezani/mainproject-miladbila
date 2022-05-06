package shop.entities.products.household;

import shop.entities.products.clothing.Dress;
import shop.entities.products.clothing.Shoes;
import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
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

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile || o instanceof Laptop || o instanceof Dress || o instanceof Shoes || o instanceof Gaz || o instanceof TV)
            return -1;
        else if (o instanceof Refrigerator)
            if (this.getName().compareTo(((Refrigerator) o).getName()) == 0)
                if (this.capacity > ((Refrigerator) o).getCapacity())
                    return 1;
                else if (this.capacity < ((Refrigerator) o).getCapacity())
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((Refrigerator) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((Refrigerator) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice() > ((Refrigerator) o).getPrice())
                    return 1;
                else if (this.getPrice() < ((Refrigerator) o).getPrice())
                    return -1;
                else if (this.getInventory() > 0 && ((Refrigerator) o).getInventory() < 1)
                    return 1;
                else if (this.getInventory() < 1 && ((Refrigerator) o).getInventory() > 0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((Refrigerator) o).getName());
        else
            return 1;
    }

    @Override
    public int calculateGuaranteeTime() {
        if (warranty)
            return (int) (capacity * 2 + getPrice());
        return 0;
    }
}
