package observer;

import java.util.List;
import java.util.ArrayList;
class MessageServiceApp implements MessagingService {
    private List<Observer> subscribers;

    public MessageServiceApp() {
        this.subscribers = new ArrayList<>();
    }

    // Method to send a new message to all subscribers
    public void sendMessage(String message) {
        notifyObservers(message);
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : subscribers) {
            observer.update(message);
        }
    }
}