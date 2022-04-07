package shop.entities;

import shop.roles.Buyer;

public class Comment {
    private final Buyer commentingUser;
    private final String product;
    private String commentText;
    private status commentStatus=status.PENDING;
    private boolean isUserBuyProduct;

    public enum status {PENDING, CONFIRMED, REJECTED}

    public Comment(Buyer commentingUser, String product, String commentText, boolean isUserBuyProduct) {
        this.commentingUser = commentingUser;
        this.product = product;
        this.commentText = commentText;
        this.isUserBuyProduct = isUserBuyProduct;
    }

    public Buyer getCommentingUser() {
        return commentingUser;
    }

    public String getProduct() {
        return product;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public status getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(status commentStatus) {
        this.commentStatus = commentStatus;
    }

    public boolean isUserBuyProduct() {
        return isUserBuyProduct;
    }

    public void setUserBuyProduct(boolean userBuyProduct) {
        isUserBuyProduct = userBuyProduct;
    }
}
