package isp.lab5.exercise4;

public class TicketingSystem {
    private final PaymentGateway paymentGateway;
    private final TicketManager ticketManager;

    public TicketingSystem(PaymentGateway paymentGateway, TicketManager ticketManager) {
        this.paymentGateway = paymentGateway;
        this.ticketManager = ticketManager;
    }

    public Ticket buyTicket(User user, Event event) {
        if (paymentGateway.processPayment(user, event.getPrice())) {
            System.out.println(user.getName() + " bought ticket for " + event.getName());
            return ticketManager.generateTicket(event, user);
        }
        System.out.println("Payment failed for " + user.getName());
        return null;
    }

    public void viewTicket(User user, Ticket ticket) {
        System.out.println(user.getName() + " is viewing ticket " + ticket.getTicketId());
    }

    public void scanTicket(Organizer organizer, Ticket ticket) {
        boolean valid = ticketManager.validateTicket(ticket);
        System.out.println(organizer.getName() + " scanned ticket " + ticket.getTicketId() + " valid=" + valid);
    }

    public void checkIn(Organizer organizer, Ticket ticket) {
        System.out.println(organizer.getName() + " checked in ticket " + ticket.getTicketId());
    }
}
