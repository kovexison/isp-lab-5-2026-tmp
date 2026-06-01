package isp.lab5.exercise4;

public class Ticket {
    private String ticketId;
    private Event event;
    private User owner;
    private TicketStatus status;

    public Ticket() {
    }

    public Ticket(String ticketId, Event event, User owner, TicketStatus status) {
        this.ticketId = ticketId;
        this.event = event;
        this.owner = owner;
        this.status = status;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public void markUsed() {
        this.status = TicketStatus.USED;
    }

    @Override
    public String toString() {
        return "Ticket{ticketId=" + ticketId + ",event=" + event + ",owner=" + owner + ",status=" + status + "}";
    }
}
