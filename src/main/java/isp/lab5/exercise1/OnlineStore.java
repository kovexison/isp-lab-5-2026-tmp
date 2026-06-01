package isp.lab5.exercise1;

public class OnlineStore {
    private String attribute1;

    public OnlineStore() {
    }

    public OnlineStore(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public String toString() {
        return "OnlineStore{attribute1=" + attribute1 + "}";
    }
}
