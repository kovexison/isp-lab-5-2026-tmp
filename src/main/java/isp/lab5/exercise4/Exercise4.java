package isp.lab5.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        User user = new User("U-100", "Mara");
        Organizer organizer = new Organizer("O-200", "Event Team");
        Event event = new Event("E-300", "City Marathon", EventType.SPORTS, 150);

        TicketManager ticketManager = new TicketManager();
        TicketingSystem ticketingSystem = new TicketingSystem(new SimplePaymentGateway(), ticketManager);

        Ticket ticket = ticketingSystem.buyTicket(user, event);
        if (ticket != null) {
            ticketingSystem.viewTicket(user, ticket);
            ticketingSystem.scanTicket(organizer, ticket);
            ticketingSystem.checkIn(organizer, ticket);
        }
    }
}
