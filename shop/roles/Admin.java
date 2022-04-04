package shop.roles;

import shop.entities.Account;

public class Admin extends Account {
    private static final Admin ADMIN = new Admin("admin", "Milad", "Tavakoli",
            "milad.tavakoli81@gmail.com", 123456789, "admin", "admin");

    private Admin(String username, String name, String lastName, String email, int phoneNumber, String password, String role) {
        super(username, name, lastName, email, phoneNumber, password);
    }

    public static Admin getADMIN() {
        return ADMIN;
    }
}
