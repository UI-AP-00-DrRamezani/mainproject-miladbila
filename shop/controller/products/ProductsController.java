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
        int n = products.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (products.get(i).compareTo(products.get(min_idx)) < 0)
                    min_idx = j;
            Product temp = products.get(min_idx);
            products.set(min_idx,products.get(i));
            products.set(i,temp);

        }
    }

    public static String shortProductSpec(Product product) {
        return "name: " + product.getName() + "\nprice: " + product.getPrice() + "\n";
    }
}
