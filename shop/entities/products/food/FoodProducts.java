package shop.entities.products.food;

import shop.entities.products.Product;

public class FoodProducts extends Product {
    String productionDate;
    String expirationDate;

    public FoodProducts(String name, String brand, double price, String sellers, int inventory, String explanation,
                        String productionDate, String expirationDate) {
        super(name, brand, price, sellers, inventory, explanation);
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
}
