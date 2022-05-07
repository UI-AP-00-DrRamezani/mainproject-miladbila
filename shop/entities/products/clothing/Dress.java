package shop.entities.products.clothing;

import shop.entities.Discount;
import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
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

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "Producing country: " + getProducingCountry()
                + "Material:" + getMaterial() + "Size: " + getSize() + "Clothing type: " + getType() + "\nexplanation:\n" + getExplanation();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile || o instanceof Laptop)
            return -1;
        else if (o instanceof Dress)
            if (this.getName().compareTo(((Dress) o).getName()) == 0)
                if (this.size > ((Dress) o).getSize())
                    return 1;
                else if (this.size < ((Dress) o).getSize())
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((Dress) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((Dress) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice() > ((Dress) o).getPrice())
                    return 1;
                else if (this.getPrice() < ((Dress) o).getPrice())
                    return -1;
                else if (this.getInventory() > 0 && ((Dress) o).getInventory() < 1)
                    return 1;
                else if (this.getInventory() < 1 && ((Dress) o).getInventory() > 0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((Dress) o).getName());
        else
            return 1;
    }

    @Override
    public void addDiscount(int capacity, String validityDuration) {
        this.getDiscountList().add(new Discount(capacity, 30, validityDuration, false));
    }

    @Override
    public void allTimeDiscount(int capacity, String validityDuration) {
        this.getDiscountList().add(new Discount(capacity, 30, validityDuration, true));
    }

    @Override
    public void makeDiscountCode(Discount discount) {
        if (discount.getCode() == null)
            discount.setCode("dre" + (int) (1000 + (Math.random() * 9999)));
    }
}
