package shop.entities.products.clothing;

import shop.entities.DiscountOption;
import shop.entities.products.Product;
import shop.roles.Seller;

abstract public class ClothingProducts extends Product implements DiscountOption {
    private String producingCountry;
    private String material;

    public ClothingProducts(String name, String brand, double price, Seller seller, int inventory, String explanation,
                            String producingCountry, String material) {
        super(name, brand, price, seller, inventory, explanation);
        this.producingCountry = producingCountry;
        this.material = material;
    }

    public ClothingProducts(int ID, String name, String brand, double price, Seller seller, int inventory, String explanation,
                            String producingCountry, String material) {
        super(ID, name, brand, price, seller, inventory, explanation);
        this.producingCountry = producingCountry;
        this.material = material;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

