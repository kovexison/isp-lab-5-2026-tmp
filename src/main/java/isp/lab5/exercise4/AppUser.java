package isp.lab5.exercise4;

public abstract class AppUser {
    private String id;
    private String name;

    public AppUser() {
    }

    public AppUser(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AppUser{id=" + id + ",name=" + name + "}";
    }
}
