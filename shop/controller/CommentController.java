package shop.controller;

import shop.entities.Comment;

import java.util.ArrayList;

public class CommentController {
    private static ArrayList<Comment> comments = new ArrayList<>();

    public static ArrayList<Comment> getComments() {
        return comments;
    }

    public static void setComment(Comment comment) {
        comments.add(comment);
    }
}
