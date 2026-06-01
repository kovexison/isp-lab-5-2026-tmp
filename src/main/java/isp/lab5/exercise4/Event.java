package isp.lab5.exercise4;

public class Event {
    private String eventId;
    private String name;
    private EventType type;
    private double price;

    public Event() {
    }

    public Event(String eventId, String name, EventType type, double price) {
        this.eventId = eventId;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{eventId=" + eventId + ",name=" + name + ",type=" + type + ",price=" + price + "}";
    }
}
