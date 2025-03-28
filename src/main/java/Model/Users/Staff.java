package Model.Users;

public class Staff extends Account {
    String role; // TODO: Make this a class with permissions, etc.

    public Staff(int userID, String username, String password, String email, String phoneNumber, String role) {
        super(userID, username, password, email, phoneNumber);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
