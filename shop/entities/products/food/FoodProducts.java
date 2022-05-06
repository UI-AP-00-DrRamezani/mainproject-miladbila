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
}
