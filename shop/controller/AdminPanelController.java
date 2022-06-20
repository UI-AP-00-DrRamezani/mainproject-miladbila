package shop.controller;

import shop.controller.products.*;
import shop.entities.products.Product;
import shop.entities.products.clothing.Dress;
import shop.entities.products.clothing.Shoes;
import shop.entities.products.digital.Laptop;
import shop.entities.products.digital.Mobile;
import shop.entities.products.food.FoodProducts;
import shop.entities.products.household.Gaz;
import shop.entities.products.household.Refrigerator;
import shop.entities.products.household.TV;
import shop.roles.Buyer;
import shop.roles.Seller;

import java.io.File;

public class AdminPanelController {
    public static void sellersList() {
        int i = 1;
        for (Seller a : SellerController.getSellerList()) {
            System.out.println(i + ". company name:" + a.getCompanyName() + "  registration status:" + a.getAccountStatus()
                    + "  username:" + a.getUsername());
            i++;
        }
    }

    public static void buyerList() {
        int i = 1;
        for (Buyer a : BuyerController.getBuyerList()) {
            System.out.println(i + ". name" + a.getName() + "  last name:" + a.getLastName() + " username:" + a.getUsername());
            i++;
        }
    }

    public static void deleteSeller(int index) {
        File file=new File("saved data\\users\\sellers\\seller "+SellerController.getSellerList().get(index - 1).getID());
        file.delete();
        SellerController.getSellerList().remove(index - 1);
    }

    public static void deleteBuyer(int index) {
        File file=new File("saved data\\users\\buyers\\buyer "+BuyerController.getBuyerList().get(index - 1).getID());
        file.delete();
        BuyerController.getBuyerList().remove(index - 1);
    }

    public static void changeSellerStatus(int index, Seller.status status) {
        SellerController.getSellerList().get(index - 1).setAccountStatus(status);
        SellerController.writeSeller(SellerController.getSellerList().get(index - 1));
    }

    public static void viewProducts() {
        int i = 1;
        for (Product a : ProductsController.getProducts()) {
            System.out.println(i + ". ID:" + a.getID() + "  name:" + a.getName() + "  price:" + a.getPrice());
            i++;
        }
    }

    public static void changeProductsStatus(int index, Product.status status) {
        ProductsController.getProducts().get(index - 1).setConfirmStatus(status);
        if (ProductsController.getProducts().get(index - 1) instanceof Mobile)
            MobileController.writeMobile((Mobile) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Laptop)
            LaptopController.writeLaptop((Laptop) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof TV)
            TVController.writeTV((TV) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Gaz)
            GazController.writeGaz((Gaz) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Refrigerator)
            RefrigeratorController.writeRefrigerator((Refrigerator) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Dress)
            DressController.writeDress((Dress) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Shoes)
            ShoesController.writeShoes((Shoes) ProductsController.getProducts().get(index - 1));
        else
            FoodController.writeFood((FoodProducts) ProductsController.getProducts().get(index - 1));
    }

    public static void deleteProduct(int index) {
        ProductsController.getProducts().get(index - 1).setConfirmStatus(Product.status.REJECTED);
        if (ProductsController.getProducts().get(index - 1) instanceof Mobile)
            MobileController.writeMobile((Mobile) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Laptop)
            LaptopController.writeLaptop((Laptop) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof TV)
            TVController.writeTV((TV) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Gaz)
            GazController.writeGaz((Gaz) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Refrigerator)
            RefrigeratorController.writeRefrigerator((Refrigerator) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Dress)
            DressController.writeDress((Dress) ProductsController.getProducts().get(index - 1));
        else if (ProductsController.getProducts().get(index - 1) instanceof Shoes)
            ShoesController.writeShoes((Shoes) ProductsController.getProducts().get(index - 1));
        else
            FoodController.writeFood((FoodProducts) ProductsController.getProducts().get(index - 1));
    }
}
