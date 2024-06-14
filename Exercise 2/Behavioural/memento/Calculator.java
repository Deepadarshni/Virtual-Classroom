package memento;

class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    // Method to perform addition operation
    public void add(int number) {
        this.result += number;
    }

    // Method to perform subtraction operation
    public void subtract(int number) {
        this.result -= number;
    }

    // Method to save the current state as a memento
    public Memento save() {
        return new Memento(result);
    }

    // Method to restore the state from a memento (undo)
    public void restore(Memento memento) {
        this.result = memento.getSavedResult();
    }

    // Method to get the current result
    public int getResult() {
        return result;
    }

    // Memento class to store the state of Calculator
    static class Memento {
        private final int savedResult;

        public Memento(int resultToSave) {
            savedResult = resultToSave;
        }

        public int getSavedResult() {
            return savedResult;
        }
    }
}
