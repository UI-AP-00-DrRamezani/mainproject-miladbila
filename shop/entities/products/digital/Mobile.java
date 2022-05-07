package shop.entities.products.digital;

import shop.entities.Discount;
import shop.roles.Seller;

public class Mobile extends DigitalProducts {
    private int simCount;
    private double camera;

    public Mobile(String name, String brand, double price, Seller seller, int inventory, String explanation, double storageCapacity,
                  double ramCapacity, String OS, double weight, String dimensions, int simCount, double camera) {
        super(name, brand, price, seller, inventory, explanation, storageCapacity, ramCapacity, OS, weight, dimensions);
        this.simCount = simCount;
        this.camera = camera;
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Category Laptop\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nSeller name: "
                + getSeller().getCompanyName() + "\nInventory :" + getInventory() + "\nStorage capacity: " + getStorageCapacity()
                + "\nRam capacity: " + getRamCapacity() + "\nOS: " + getOS() + "\nweight" + getWeight() + "\ndimensions" +
                getDimensions() + "\nSim card count: " + getSimCount() + "\nCamera: " + getCamera() + "\nexplanation:\n" + getExplanation();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mobile)
            if (this.getName().compareTo(((Mobile) o).getName()) == 0)
                if (this.getSimCount() > ((Mobile) o).simCount)
                    return 1;
                else if (this.getSimCount() < ((Mobile) o).simCount)
                    return -1;
                else if (this.getAverageScoreOfBuyers() > ((Mobile) o).getAverageScoreOfBuyers())
                    return 1;
                else if (this.getAverageScoreOfBuyers() < ((Mobile) o).getAverageScoreOfBuyers())
                    return -1;
                else if (this.getPrice() > ((Mobile) o).getPrice())
                    return 1;
                else if (this.getPrice() < ((Mobile) o).getPrice())
                    return -1;
                else if (this.getInventory() > 0 && ((Mobile) o).getInventory() < 1)
                    return 1;
                else if (this.getInventory() < 1 && ((Mobile) o).getInventory() > 0)
                    return -1;
                else
                    return 0;
            else
                return this.getName().compareTo(((Mobile) o).getName());
        else
            return 1;
    }

    @Override
    public void addDiscount(int capacity, String validityDuration) {
        this.getDiscountList().add(new Discount(capacity, 25, validityDuration, false));
    }

    @Override
    public void allTimeDiscount(int capacity, String validityDuration) {
        this.getDiscountList().add(new Discount(capacity, 25, validityDuration, true));
    }

    @Override
    public void makeDiscountCode(Discount discount) {
        if (discount.getCode() == null)
            discount.setCode("mob" + (int) (1000 + (Math.random() * 9999)));
    }
}
