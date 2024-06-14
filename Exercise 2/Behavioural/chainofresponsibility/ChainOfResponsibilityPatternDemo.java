package chainofresponsibility;

public class ChainOfResponsibilityPatternDemo {
	public static void main(String[] args) {
        // Create handlers
        Handler lowPriorityHandler = new LowPriorityHandler();
        Handler mediumPriorityHandler = new MediumPriorityHandler();
        Handler highPriorityHandler = new HighPriorityHandler();

        // Set up the chain of responsibility
        lowPriorityHandler.handleTicket(new Ticket("low", "Issue with login"));
        mediumPriorityHandler.handleTicket(new Ticket("medium", "Database connection problem"));
        highPriorityHandler.handleTicket(new Ticket("urgent", "Website crash"));
    }

}
