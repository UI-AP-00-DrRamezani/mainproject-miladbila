package shop.entities.products.food;

import shop.entities.products.Product;
import shop.roles.Seller;

public class FoodProducts extends Product {
    String productionDate;
    String expirationDate;

    public FoodProducts(String name, String brand, double price, Seller seller, int inventory, String explanation,
                        String productionDate, String expirationDate) {
        super(name, brand, price, seller, inventory, explanation);
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "Production date: " + getProductionDate()
                + "Expiration date: " + getExpirationDate() + "\nexplanation:\n" + getExplanation();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof FoodProducts)
            if (this.getName().compareTo(((FoodProducts) o).getName()) == 0)
                if (this.productionDate.compareTo(((FoodProducts) o).getProductionDate()) > 0)
                    return 1;
                else if (this.productionDate.compareTo(((FoodProducts) o).getProductionDate()) < 0)
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((FoodProducts) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((FoodProducts) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice() > ((FoodProducts) o).getPrice())
                    return 1;
                else if (this.getPrice() < ((FoodProducts) o).getPrice())
                    return -1;
                else if (this.getInventory() > 0 && ((FoodProducts) o).getInventory() < 1)
                    return 1;
                else if (this.getInventory() < 1 && ((FoodProducts) o).getInventory() > 0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((FoodProducts) o).getName());
        else
            return -1;
    }
}
