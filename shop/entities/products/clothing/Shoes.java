package shop.entities.products.clothing;

import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
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

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "Producing country: " + getProducingCountry()
                + "Material:" + getMaterial() + "Size: " + getSize() + "Shoes type: " + getType() + "\nexplanation:\n" + getExplanation();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile||o instanceof Laptop||o instanceof Dress)
            return -1;
        else if (o instanceof Shoes)
            if (this.getName().compareTo(((Shoes) o).getName()) == 0)
                if (this.size > ((Shoes) o).getSize())
                    return 1;
                else if (this.size < ((Shoes) o).getSize())
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((Shoes) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((Shoes) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice()>((Shoes) o).getPrice())
                    return 1;
                else if (this.getPrice()<((Shoes) o).getPrice())
                    return -1;
                else if (this.getInventory()>0&&((Shoes) o).getInventory()<1)
                    return 1;
                else if (this.getInventory()<1&&((Shoes) o).getInventory()>0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((Shoes) o).getName());
        else
            return 1;
    }
}
