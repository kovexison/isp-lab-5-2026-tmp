package isp.lab5.exercise4;

public class TicketManager {
    private int nextId = 1;

    public Ticket generateTicket(Event event, User user) {
        String ticketId = "T-" + nextId++;
        Ticket ticket = new Ticket(ticketId, event, user, TicketStatus.ACTIVE);
        System.out.println("Generated ticket " + ticketId + " for " + user.getName());
        return ticket;
    }

    public boolean validateTicket(Ticket ticket) {
        if (ticket == null || ticket.getStatus() != TicketStatus.ACTIVE) {
            return false;
        }
        ticket.markUsed();
        return true;
    }
}
