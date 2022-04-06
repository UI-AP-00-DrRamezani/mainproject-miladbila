package shop.entities.products.clothing;

import shop.roles.Seller;

public class Dress extends ClothingProducts {
    public enum ClothingType {
        shirt, pants
    }

    int size;
    ClothingType type;

    public Dress(String name, String brand, double price, Seller seller, int inventory, String explanation,
                 String producingCountry, String material, int size, ClothingType type) {
        super(name, brand, price, seller, inventory, explanation, producingCountry, material);
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ClothingType getType() {
        return type;
    }

    public void setType(ClothingType type) {
        this.type = type;
    }
}
