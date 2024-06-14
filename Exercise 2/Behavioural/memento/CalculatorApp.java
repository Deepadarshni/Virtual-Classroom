package memento;

class CalculatorApp {
    private Calculator.Memento memento;

    // Method to save the current state of the calculator
    public void saveCalculatorState(Calculator calculator) {
        memento = calculator.save();
    }

    // Method to undo the last operation performed
    public void undo(Calculator calculator) {
        calculator.restore(memento);
    }
}
