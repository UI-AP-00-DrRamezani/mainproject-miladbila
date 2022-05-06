package shop.entities;

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
        this.phoneNumber = phoneNumber;
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
        boolean atSign = false;
        boolean dot = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
                atSign = true;
            if (email.charAt(i) == '.')
                dot = true;
        }
        if (atSign == true && dot == true)
            this.email = email;
        else {
            System.out.println("email format invalid , please enter your email again");
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}