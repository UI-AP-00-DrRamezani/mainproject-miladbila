package shop.entities;

public class Score {
    private final String user;
    private double score;
    private final String product;

    public Score(String user, double score, String product) {
        this.user = user;
        this.score = score;
        this.product = product;
    }

    public String getUser() {
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
