package isp.lab5.exercise4;

public class User extends AppUser {
    public User() {
    }

    public User(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "User{id=" + getId() + ",name=" + getName() + "}";
    }
}
