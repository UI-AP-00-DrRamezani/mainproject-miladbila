package shop.controller.products;

import shop.entities.products.Product;

import java.util.ArrayList;

public class ProductsController {
    private static ArrayList<Product> products = new ArrayList<>();

    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void setProducts(Product product) {
        ProductsController.products.add(product);
    }

    public static String shortProductSpec(Product product) {
        return "name: " + product.getName() + "\nprice: " + product.getPrice() + "\n";
    }
}
