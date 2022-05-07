package shop.exception;

public class InvalidEmail extends InvalidInputException {
    InvalidEmail(String message) {
        super(message);
    }

    InvalidEmail() {
        super("Invalid input:invalid email");
    }
}
