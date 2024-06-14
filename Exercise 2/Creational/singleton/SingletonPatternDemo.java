package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the singleton instance of Counter
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        // Use the instance to increment count
        counter1.increment();
        counter2.increment();

        // Print the count from both instances
        System.out.println("Count from counter1: " + counter1.getCount()); // Output: Count from counter1: 2
        System.out.println("Count from counter2: " + counter2.getCount()); // Output: Count from counter2: 2

        // Even if we try to create another instance, we still get the same singleton instance
        Counter anotherCounter = Counter.getInstance();
        System.out.println("Same instance? " + (counter1 == anotherCounter)); // Output: Same instance? true
    }
}