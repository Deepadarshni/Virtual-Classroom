package Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Create a Person using the Builder
        Person person1 = new Person.Builder("John")
                                .age(30)
                                .gender("Male")
                                .address("123 Main St, Anytown")
                                .build();

        // Create another Person with minimal information
        Person person2 = new Person.Builder("Jane")
                                .age(25)
                                .build();

        // Display the created Person objects
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}
