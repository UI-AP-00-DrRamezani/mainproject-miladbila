package shop.entities;

import shop.exception.InvalidEmail;
import shop.exception.InvalidPhoneNumberException;

import java.util.regex.Pattern;

public class Account {
    private final String username;
    private String name;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String password;

    public Account(String username, String name, String lastName, String email, int phoneNumber, String password) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        setEmail(email);
        setPhoneNumber(phoneNumber);
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Pattern.matches(".+@.+[.].+", email))
            throw new InvalidEmail("invalid email format");
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (Pattern.matches("[0]{1}[9]{1}[\\d]{8}", String.valueOf(phoneNumber)))
            throw new InvalidPhoneNumberException("invalid phone number format");
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}