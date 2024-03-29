package shop.entities;

public interface DiscountOption {
    void addDiscount(int capacity, String validityDuration);
    void allTimeDiscount(int capacity, String validityDuration);
    void makeDiscountCode(Discount discount);
}
