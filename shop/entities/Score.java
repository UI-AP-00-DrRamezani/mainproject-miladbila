package shop.entities;

import shop.entities.products.Product;
import shop.roles.Buyer;

public class Score {
    private final Buyer user;
    private double score;
    private final Product product;

    public Score(Buyer user, double score, Product product) {
        this.user = user;
        this.score = score;
        this.product = product;
    }

    public Buyer getUser() {
        return user;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Product getProduct() {
        return product;
    }
}
