package memento;

public class MementoPatternDemo {

	public static void main(String[] args) {
		// Create a Calculator instance
        Calculator calculator = new Calculator();

        // Create a caretaker instance
        CalculatorApp calculatorApp = new CalculatorApp();

        // Perform operations
        calculator.add(10); // result = 10
        calculator.add(5);  // result = 15
        calculator.subtract(3); // result = 12

        // Save the state after operations
        calculatorApp.saveCalculatorState(calculator);
        System.out.println("Current result: " + calculator.getResult());

        // Perform more operations
        calculator.add(8);  // result = 20
        System.out.println("Modified result: " + calculator.getResult());

        // Undo the last operation
        calculatorApp.undo(calculator);
        System.out.println("After undo: " + calculator.getResult());

	}

}
