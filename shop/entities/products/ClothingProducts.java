package shop.entities.products;

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

class Dress extends ClothingProducts {
    enum ClothingType {
        shirt, pants
    }
    int size;
    ClothingType type;

    public Dress(String name, String brand, double price, String sellers, int inventory, String explanation,
                 String producingCountry, String material, int size, ClothingType type) {
        super(name, brand, price, sellers, inventory, explanation, producingCountry, material);
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

class Shoes extends ClothingProducts {
    enum ShoesType {
        boot, sport, formal
    }

    int size;
    ShoesType type;

    public Shoes(String name, String brand, double price, String sellers, int inventory, String explanation,
                 String producingCountry, String material, int size, ShoesType type) {
        super(name, brand, price, sellers, inventory, explanation, producingCountry, material);
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
