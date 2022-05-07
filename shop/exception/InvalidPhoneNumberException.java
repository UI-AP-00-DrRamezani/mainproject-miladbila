package shop.exception;

public class InvalidPhoneNumberException extends InvalidInputException {
    InvalidPhoneNumberException(String message) {
        super(message);
    }

    InvalidPhoneNumberException() {
        super("Invalid input:invalid phone number");
    }
}
