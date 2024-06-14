package chainofresponsibility;

class MediumPriorityHandler implements Handler {
	   @Override
	    public void handleTicket(Ticket ticket) {
	        if (ticket.getPriority().equalsIgnoreCase("medium")) {
	            System.out.println("Medium priority ticket handled: " + ticket.getDescription());
	        } else {
	            System.out.println("Passing medium priority ticket to the next handler.");
	        }
	    }
}
