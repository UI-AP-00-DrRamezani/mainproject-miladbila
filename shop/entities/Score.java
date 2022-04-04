package shop.entities;

import shop.roles.Buyer;

public class Score {
    private final Buyer user;
    private double score;
    private final String product;

    public Score(Buyer user, double score, String product) {
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

    public String getProduct() {
        return product;
    }
}
