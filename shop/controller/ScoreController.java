package shop.controller;

import shop.entities.Score;
import shop.entities.products.Product;

import java.util.ArrayList;

public class ScoreController {
    private static ArrayList<Score> scores = new ArrayList<>();

    public static ArrayList<Score> getScores() {
        return scores;
    }

    public static void setScore(Score score) {
        scores.add(score);
    }

    public static void generateAverage(Product product) {
        double sum = 0;
        int counter = 0;
        for (Score a : scores)
            if (a.getProduct() == product) {
                counter++;
                sum += a.getScore();
            }
        product.setAverageScoreOfBuyers(sum / counter);
    }
}
