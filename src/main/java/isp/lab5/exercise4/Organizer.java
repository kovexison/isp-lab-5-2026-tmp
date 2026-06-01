package isp.lab5.exercise4;

public class Organizer extends AppUser {
    public Organizer() {
    }

    public Organizer(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Organizer{id=" + getId() + ",name=" + getName() + "}";
    }
}
