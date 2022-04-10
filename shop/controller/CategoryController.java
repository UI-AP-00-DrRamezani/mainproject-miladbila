package shop.controller;

import shop.entities.Category;

public class CategoryController {
    private static Category mobile = new Category("mobile", "camera,sim card count");
    private static Category laptop = new Category("laptop", "cpu,gaming");
    private static Category dress = new Category("dress", "type,size");
    private static Category shoes = new Category("shoes", "type,size");
    private static Category TV = new Category("TV", "screen size,relocation");
    private static Category refrigerator = new Category("refrigerator", "capacity,type");
    private static Category gaz = new Category("gaz", "flame count,material");
    private static Category food = new Category("mobile", "production date,expiration date");

    public static Category getMobile() {
        return mobile;
    }

    public static void setMobile(Category mobile) {
        CategoryController.mobile = mobile;
    }

    public static Category getLaptop() {
        return laptop;
    }

    public static void setLaptop(Category laptop) {
        CategoryController.laptop = laptop;
    }

    public static Category getDress() {
        return dress;
    }

    public static void setDress(Category dress) {
        CategoryController.dress = dress;
    }

    public static Category getShoes() {
        return shoes;
    }

    public static void setShoes(Category shoes) {
        CategoryController.shoes = shoes;
    }

    public static Category getTV() {
        return TV;
    }

    public static void setTV(Category TV) {
        CategoryController.TV = TV;
    }

    public static Category getRefrigerator() {
        return refrigerator;
    }

    public static void setRefrigerator(Category refrigerator) {
        CategoryController.refrigerator = refrigerator;
    }

    public static Category getGaz() {
        return gaz;
    }

    public static void setGaz(Category gaz) {
        CategoryController.gaz = gaz;
    }

    public static Category getFood() {
        return food;
    }

    public static void setFood(Category food) {
        CategoryController.food = food;
    }
}
