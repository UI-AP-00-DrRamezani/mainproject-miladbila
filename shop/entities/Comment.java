package shop.entities;
public class Comment {
    private final String commentingUser;
    private final String product;
    private String commentText;
    private String commentStatus;
    private boolean isUserBuyProduct;

    public Comment(String commentingUser, String product, String commentText, boolean isUserBuyProduct) {
        this.commentingUser = commentingUser;
        this.product = product;
        this.commentText = commentText;
        this.commentStatus = "Not approved";
        this.isUserBuyProduct = isUserBuyProduct;
    }

    public String getCommentingUser() {
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

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public boolean isUserBuyProduct() {
        return isUserBuyProduct;
    }

    public void setUserBuyProduct(boolean userBuyProduct) {
        isUserBuyProduct = userBuyProduct;
    }
}
