package shop.entities.products.clothing;

import shop.roles.Seller;

public class Shoes extends ClothingProducts {
    public enum ShoesType {
        boot, sport, formal
    }

    int size;
    ShoesType type;

    public Shoes(String name, String brand, double price, Seller seller, int inventory, String explanation,
                 String producingCountry, String material, int size, ShoesType type) {
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

    public ShoesType getType() {
        return type;
    }

    public void setType(ShoesType type) {
        this.type = type;
    }
}
