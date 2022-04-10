package shop.pages;

import shop.controller.ShowProductListController;
import shop.entities.products.Product;
import shop.roles.Buyer;

import java.util.ArrayList;

import static shop.pages.Main.input;

public class ShowProductList {
    public static void selectCategory(Buyer buyer) {
        System.out.println("Select a category");
        System.out.println("Digital Product");
        System.out.println("    1. Mobile");
        System.out.println("    2. Laptop");
        System.out.println("Clothing Product");
        System.out.println("    3. Dress");
        System.out.println("    4. Shoes");
        System.out.println("Household Product");
        System.out.println("    5. Gaz");
        System.out.println("    6. TV");
        System.out.println("    7. Refrigerator");
        System.out.println("Food Product");
        System.out.println("    8. Food");
        switch (input.nextInt()) {
            case 1 -> addFilterMobile(buyer);
            case 2 -> addFilterLaptop(buyer);
            case 3 -> addFilterDress(buyer);
            case 4 -> addFilterShoes(buyer);
            case 5 -> addFilterGaz(buyer);
            case 6 -> addFilterTV(buyer);
            case 7 -> addFilterRefrigerator(buyer);
            case 8 -> addFilterFood(buyer);
        }
    }

    private static void addFilterMobile(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("sim count");
        String simCount = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterMobile(buyer, brand, simCount, availability);
    }

    private static void addFilterLaptop(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("cpu");
        String cpu = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterLaptop(buyer, brand, cpu, availability);
    }

    private static void addFilterFood(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("expire date");
        String expireDate = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterFood(buyer, brand, expireDate, availability);
    }

    private static void addFilterGaz(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("material");
        String material = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterGaz(buyer, brand, material, availability);
    }

    private static void addFilterTV(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("screen relocation");
        String relocation = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterTV(buyer, brand, relocation, availability);
    }


    private static void addFilterRefrigerator(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("type");
        String type = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterRefrigerator(buyer, brand, type, availability);
    }

    private static void addFilterDress(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("size");
        String size = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterDress(buyer, brand, size, availability);
    }

    private static void addFilterShoes(Buyer buyer) {
        System.out.println("Select the desired filter or leave it blank");
        System.out.println("brand");
        String brand = input.nextLine();
        System.out.println("size");
        String size = input.nextLine();
        input.nextLine();
        System.out.println("only available products(y/n)");
        String availability = input.nextLine();
        ShowProductListController.addFilterShoes(buyer, brand, size, availability);
    }

    public static void ShowProductList(Buyer buyer, ArrayList<Product> products) {
        ShowProductListController.ShowProductList(products);
        System.out.println("Select product , for search enter s and for back enter 0:");
        String n = input.nextLine();
        if (n.equals("0")) {
            return;
        } else if (n.equals("s")) {
            System.out.println("enter search text");
            ShowProductListController.search(buyer, input.nextLine(),products);
        } else {
            ShowProductListController.selectProduct(Integer.parseInt(n), buyer, products);
        }
    }
}
