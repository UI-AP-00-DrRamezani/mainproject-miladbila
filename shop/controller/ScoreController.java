package shop.controller;

import shop.entities.Score;
import shop.entities.products.Product;

import java.io.*;
import java.util.ArrayList;

public class ScoreController {
    static ArrayList<Score> scores = new ArrayList<>();

    public static ArrayList<Score> getScores() {
        return scores;
    }

    public static void setScore(Score score) {
        scores.add(score);
        writeScore();
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
        String[] temp = product.getClass().toString().split(".");
        File file = new File("saved data\\products\\" + temp[3] + "\\" + temp[4]+"\\productsList\\"+temp[4]+product.getID());
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            int size = 0;
            size += randomAccessFile.readLine().length() * 4;
            size += randomAccessFile.readLine().length() * 4;
            size += randomAccessFile.readLine().length() * 4;
            size += randomAccessFile.readLine().length() * 4;
            size += randomAccessFile.readLine().length() * 4;
            size += randomAccessFile.readLine().length() * 4;
            size += randomAccessFile.readLine().length() * 4;
            randomAccessFile.seek(size);
            randomAccessFile.writeDouble(sum / counter);
            randomAccessFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeScore() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("saved data\\products\\scores.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.writeObject(scores);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
