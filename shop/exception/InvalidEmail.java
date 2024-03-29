package shop.exception;

public class InvalidEmail extends InvalidInputException {
    public InvalidEmail(String message) {
        super("Invalid input:invalid email:" + message);
    }

    InvalidEmail() {
        super("Invalid input:invalid email");
    }
}
