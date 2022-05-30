package shop.exception;

public class InvalidPhoneNumberException extends InvalidInputException {
    InvalidPhoneNumberException(String message) {
        super("Invalid input:invalid phone number:" + message);
    }

    InvalidPhoneNumberException() {
        super("Invalid input:invalid phone number");
    }
}
