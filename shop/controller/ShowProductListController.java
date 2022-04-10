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
import shop.pages.ProductPage;
import shop.pages.ShowProductList;
import shop.roles.Buyer;

import java.util.ArrayList;

public class ShowProductListController {
    public static void ShowProductList(ArrayList<Product> products) {
        int i = 1;
        for (Product a : products) {
            System.out.println(i + ". " + ProductsController.shortProductSpec(a));
            i++;
        }
    }

    public static void selectProduct(int index, Buyer buyer, ArrayList<Product> products) {
        ProductPage.showInfo(products.get(index - 1), buyer);
    }

    public static void addFilterMobile(Buyer buyer, String brand, String simCount, String availability) {
        ArrayList<Mobile> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (Mobile a : MobileController.getMobiles()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(MobileController.getMobiles());
        }

        ArrayList<Mobile> temp2 = new ArrayList<>();
        if (!simCount.equals("")) {
            for (Mobile a : temp1) {
                if (a.getSimCount() == Integer.parseInt(simCount))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<Mobile> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (Mobile a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterLaptop(Buyer buyer, String brand, String cpu, String availability) {
        ArrayList<Laptop> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (Laptop a : LaptopController.getLaptops()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(LaptopController.getLaptops());
        }

        ArrayList<Laptop> temp2 = new ArrayList<>();
        if (!cpu.equals("")) {
            for (Laptop a : temp1) {
                if (a.getCPU().equals(cpu))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<Laptop> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (Laptop a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterFood(Buyer buyer, String brand, String expireDate, String availability) {
        ArrayList<FoodProducts> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (FoodProducts a : FoodController.getFoodProducts()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(FoodController.getFoodProducts());
        }

        ArrayList<FoodProducts> temp2 = new ArrayList<>();
        if (!expireDate.equals("")) {
            for (FoodProducts a : temp1) {
                if (a.getExpirationDate().equals(expireDate))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<FoodProducts> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (FoodProducts a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterGaz(Buyer buyer, String brand, String material, String availability) {
        ArrayList<Gaz> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (Gaz a : GazController.getGazes()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(GazController.getGazes());
        }

        ArrayList<Gaz> temp2 = new ArrayList<>();
        if (!material.equals("")) {
            for (Gaz a : temp1) {
                if (a.getMaterial().equals(material))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<Gaz> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (Gaz a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterRefrigerator(Buyer buyer, String brand, String type, String availability) {
        ArrayList<Refrigerator> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (Refrigerator a : RefrigeratorController.getRefrigerators()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(RefrigeratorController.getRefrigerators());
        }

        ArrayList<Refrigerator> temp2 = new ArrayList<>();
        if (!type.equals("")) {
            for (Refrigerator a : temp1) {
                if (a.getType().equals(type))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<Refrigerator> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (Refrigerator a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterTV(Buyer buyer, String brand, String relocation, String availability) {
        ArrayList<TV> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (TV a : TVController.getTVs()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(TVController.getTVs());
        }

        ArrayList<TV> temp2 = new ArrayList<>();
        if (!relocation.equals("")) {
            for (TV a : temp1) {
                if (a.getRelocation().equals(relocation))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<TV> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (TV a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterDress(Buyer buyer, String brand, String size, String availability) {
        ArrayList<Dress> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (Dress a : DressController.getDresses()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(DressController.getDresses());
        }

        ArrayList<Dress> temp2 = new ArrayList<>();
        if (!size.equals("")) {
            for (Dress a : temp1) {
                if (a.getSize() == Integer.parseInt(size))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<Dress> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (Dress a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void addFilterShoes(Buyer buyer, String brand, String size, String availability) {
        ArrayList<Shoes> temp1 = new ArrayList<>();
        if (availability.equals("y")) {
            for (Shoes a : ShoesController.getShoes()) {
                if (a.getInventory() > 0)
                    temp1.add(a);
            }
        } else {
            temp1.addAll(ShoesController.getShoes());
        }

        ArrayList<Shoes> temp2 = new ArrayList<>();
        if (!size.equals("")) {
            for (Shoes a : temp1) {
                if (a.getSize() == Integer.parseInt(size))
                    temp2.add(a);
            }
        } else {
            temp2.addAll(temp1);
        }

        ArrayList<Shoes> temp3 = new ArrayList<>();
        if (!brand.equals("")) {
            for (Shoes a : temp2) {
                if (a.getBrand().equals(brand))
                    temp3.add(a);
            }
        } else {
            temp3.addAll(temp1);
        }

        ArrayList<Product> finalTemp = new ArrayList<>();
        finalTemp.addAll(temp3);

        ShowProductList.ShowProductList(buyer, finalTemp);
    }

    public static void search(Buyer buyer, String search, ArrayList<Product> products) {
        ArrayList<Product> temp = new ArrayList<>();
        for (Product a : products)
            if (a.getName().equals(search))
                temp.add(a);
        ShowProductList.ShowProductList(buyer, temp);
    }
}
