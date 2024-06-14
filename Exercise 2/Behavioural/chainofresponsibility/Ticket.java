package chainofresponsibility;

public class Ticket {
    private String priority;
    private String description;

    public Ticket(String priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
