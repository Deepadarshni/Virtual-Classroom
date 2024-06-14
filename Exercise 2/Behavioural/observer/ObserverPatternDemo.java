package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create a messaging service (subject)
        MessageServiceApp messagingService = new MessageServiceApp();

        // Create users (observers)
        Observer user1 = new User("User 1");
        Observer user2 = new User("User 2");

        // Register users as observers
        messagingService.registerObserver(user1);
        messagingService.registerObserver(user2);

        // Send messages
        messagingService.sendMessage("Hello, everyone!");
        messagingService.sendMessage("How are you today?");

        // Unregister user2 from receiving updates
        messagingService.removeObserver(user2);

        // Send another message
        messagingService.sendMessage("Goodbye!");
    }
}