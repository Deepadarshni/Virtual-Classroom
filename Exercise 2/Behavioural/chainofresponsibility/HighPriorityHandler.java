package chainofresponsibility;

class HighPriorityHandler implements Handler {
	@Override
    public void handleTicket(Ticket ticket) {
        if (ticket.getPriority().equalsIgnoreCase("high")) {
            System.out.println("High priority ticket handled: " + ticket.getDescription());
        } else {
            System.out.println("No handler available for this ticket.");
        }
    }
}
