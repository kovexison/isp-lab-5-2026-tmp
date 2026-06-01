package isp.lab5.exercise4;

import org.junit.Assert;
import org.junit.Test;

public class Exercise4Test {
    @Test
    public void testTicketPurchase() {
        User user = new User("U-1", "Ana");
        Event event = new Event("E-1", "Concert", EventType.CONCERT, 120);
        TicketManager ticketManager = new TicketManager();
        TicketingSystem ticketingSystem = new TicketingSystem(new SimplePaymentGateway(), ticketManager);

        Ticket ticket = ticketingSystem.buyTicket(user, event);

        Assert.assertNotNull(ticket);
        Assert.assertEquals(user, ticket.getOwner());
        Assert.assertEquals(event, ticket.getEvent());
        Assert.assertEquals(TicketStatus.ACTIVE, ticket.getStatus());

        Assert.assertTrue(ticketManager.validateTicket(ticket));
        Assert.assertEquals(TicketStatus.USED, ticket.getStatus());
    }
}
