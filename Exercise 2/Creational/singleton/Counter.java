package singleton;

class Counter {
    // Static variable to hold the single instance of the class
    private static Counter instance;

    // Instance variable to maintain count of instances created
    private int count;

    // Private constructor to prevent instantiation from outside
    private Counter() {
        // Initialize count to 0
        count = 0;
    }

    // Static method to get the singleton instance
    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    // Method to increment count
    public void increment() {
        count++;
    }

    // Method to get current count
    public int getCount() {
        return count;
    }
}