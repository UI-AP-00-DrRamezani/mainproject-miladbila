package shop.controller;

import shop.entities.Comment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CommentController {
    static ArrayList<Comment> comments = new ArrayList<>();

    public static ArrayList<Comment> getComments() {
        return comments;
    }

    public static void setComment(Comment comment) {
        comments.add(comment);
        writeComment();
    }

    private static void writeComment() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("saved data\\products\\comments.txt");
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
            objectOutputStream.writeObject(comments);
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
