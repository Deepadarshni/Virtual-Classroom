package adapter;
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Wrap the toy duck in a bird adapter so it can be used as a bird
        Bird toyDuckAdapter = new BirdAdapter(toyDuck);

        System.out.println("Sparrow:");
        sparrow.makeSound();

        System.out.println("PlasticToyDuck:");
        toyDuck.squeak();

        System.out.println("BirdAdapter:");
        toyDuckAdapter.makeSound(); // This will call toyDuck.squeak() internally
    }
}
