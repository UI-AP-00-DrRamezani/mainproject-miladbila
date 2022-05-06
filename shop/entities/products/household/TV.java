package shop.entities.products.household;

import shop.entities.products.clothing.Dress;
import shop.entities.products.clothing.Shoes;
import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
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
    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile ||o instanceof Laptop ||o instanceof Dress ||o instanceof Shoes||o instanceof Gaz)
            return -1;
        else if (o instanceof TV)
            if (this.getName().compareTo(((TV) o).getName()) == 0)
                if (this.screenSize > ((TV) o).getScreenSize())
                    return 1;
                else if (this.screenSize < ((TV) o).getScreenSize())
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((TV) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((TV) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice()>((TV) o).getPrice())
                    return 1;
                else if (this.getPrice()<((TV) o).getPrice())
                    return -1;
                else if (this.getInventory()>0&&((TV) o).getInventory()<1)
                    return 1;
                else if (this.getInventory()<1&&((TV) o).getInventory()>0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((TV) o).getName());
        else
            return 1;
    }
}
