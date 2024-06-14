package chainofresponsibility;

class LowPriorityHandler implements Handler {
	@Override
    public void handleTicket(Ticket ticket) {
        if (ticket.getPriority().equalsIgnoreCase("low")) {
            System.out.println("Low priority ticket handled: " + ticket.getDescription());
        } else {
            System.out.println("Passing low priority ticket to the next handler.");
        }
    }
}
