package shop.pages;

import shop.controller.ProductPageController;
import shop.entities.products.Product;
import shop.roles.Buyer;

import static shop.pages.Main.input;

public class ProductPage {
    public static String scoreStatus;

    public static void showInfo(Product product, Buyer buyer) {
        System.out.println(product.toString());
        System.out.println("1. add to cart");
        System.out.println("2. Submit a comment");
        System.out.println("3. Submit score");
        System.out.println("4. return");
        int n = input.nextInt();
        input.nextLine();
        switch (n) {
            case 1 -> addToCart(product, buyer);
            case 2 -> comment(product, buyer);
            case 3 -> score(product, buyer);
        }
    }

    private static void addToCart(Product product, Buyer buyer) {
        if (buyer == null) {
            System.out.println("Please login as buyer");
            LogIn.login();
            return;
        }
        System.out.println("Enter the item number");
        int count = input.nextInt();
        input.nextLine();
        ProductPageController.addToCart(product, buyer, count);
    }

    private static void comment(Product product, Buyer buyer) {
        if (buyer == null) {
            System.out.println("Please login as buyer");
            LogIn.login();
            return;
        }
        System.out.println("Enter comment text:");
        ProductPageController.comment(product, buyer, input.nextLine());
        System.out.println("Your comment was successfully registered");

    }

    private static void score(Product product, Buyer buyer) {
        if (buyer == null) {
            System.out.println("Please login as buyer");
            LogIn.login();
            return;
        }
        System.out.println("Enter score from 0 to 5");
        int score = input.nextInt();
        input.nextLine();
        ProductPageController.score(product, buyer, score);
        System.out.println(scoreStatus);
    }
}
