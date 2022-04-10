package shop.controller;

import shop.entities.Comment;
import shop.entities.PurchaseInvoice;
import shop.entities.Score;
import shop.entities.products.Product;
import shop.pages.ProductPage;
import shop.roles.Buyer;

public class ProductPageController {
    public static void addToCart(Product product, Buyer buyer, int count) {
        if (count > product.getInventory()) {
            System.out.println("The number of items you want is more than the inventory");
            return;
        }
        for (int i = 0; i < count; i++)
            buyer.setCart(product);
    }

    public static void score(Product product, Buyer buyer, double score) {

        if (didUserBuy(product, buyer)) {
            ScoreController.setScore(new Score(buyer, score, product));
            ProductPage.scoreStatus = "Your score was successfully registered";
            ScoreController.generateAverage(product);
            return;
        }
        ProductPage.scoreStatus = "You must have purchased the product to register score";
    }

    public static void comment(Product product, Buyer buyer, String text) {
        CommentController.setComment(new Comment(buyer, product, text, didUserBuy(product, buyer)));
    }

    public static boolean didUserBuy(Product product, Buyer buyer) {
        for (PurchaseInvoice a : buyer.getPurchaseInvoices())
            for (Product b : a.getProductsPurchased())
                if (b.getID() == product.getID()) {
                    return true;
                }
        return false;
    }
}
