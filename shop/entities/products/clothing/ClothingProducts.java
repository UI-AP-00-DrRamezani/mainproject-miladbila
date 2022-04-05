package shop.entities.products.clothing;

import shop.entities.products.Product;

abstract public class ClothingProducts extends Product {
    private String producingCountry;
    private String material;

    public ClothingProducts(String name, String brand, double price, String sellers, int inventory, String explanation,
                            String producingCountry, String material) {
        super(name, brand, price, sellers, inventory, explanation);
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

