package shop.entities.products.digital;

import shop.entities.Discount;
import shop.roles.Seller;

public class Laptop extends DigitalProducts {
    private String CPU;
    private boolean isGaming;

    public Laptop(String name, String brand, double price, Seller seller, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, String CPU, boolean isGaming) {
        super(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
        this.CPU = CPU;
        this.isGaming = isGaming;
    }

    public Laptop(int ID, String name, String brand, double price, Seller seller, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, String CPU, boolean isGaming) {
        super(ID, name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
        this.CPU = CPU;
        this.isGaming = isGaming;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public boolean isGaming() {
        return isGaming;
    }

    public void setGaming(boolean gaming) {
        isGaming = gaming;
    }

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "\nStorage capacity: " + getStorageCapacity()
                + "\nRam capacity: " + getRamCapacity() + "\nOS: " + getOS() + "\nweight" + getWeight() + "\ndimensions" +
                getDimensions() + "\nCPU: " + getCPU() + "\ngaming" + isGaming() + "\nexplanation:\n" + getExplanation();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile)
            return -1;
        else if (o instanceof Laptop)
            if (this.getName().compareTo(((Laptop) o).getName()) == 0)
                if (this.getRamCapacity() > ((Laptop) o).getRamCapacity())
                    return 1;
                else if (this.getRamCapacity() < ((Laptop) o).getRamCapacity())
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((Laptop) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((Laptop) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice() > ((Laptop) o).getPrice())
                    return 1;
                else if (this.getPrice() < ((Laptop) o).getPrice())
                    return -1;
                else if (this.getInventory() > 0 && ((Laptop) o).getInventory() < 1)
                    return 1;
                else if (this.getInventory() < 1 && ((Laptop) o).getInventory() > 0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((Laptop) o).getName());
        else
            return 1;
    }

    @Override
    public void addDiscount(int capacity, String validityDuration) {
        this.getDiscountList().add(new Discount(capacity, 20, validityDuration, false));
    }

    @Override
    public void allTimeDiscount(int capacity, String validityDuration) {
        this.getDiscountList().add(new Discount(capacity, 20, validityDuration, true));
    }

    @Override
    public void makeDiscountCode(Discount discount) {
        if (discount.getCode() == null)
            discount.setCode("lap" + (int) (1000 + (Math.random() * 9999)));
    }
}
