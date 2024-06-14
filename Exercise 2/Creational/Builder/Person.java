package Builder;

class Person {
 private String name;
 private int age;
 private String gender;
 private String address;

 // Private constructor to enforce creation via builder
 private Person(Builder builder) {
     this.name = builder.name;
     this.age = builder.age;
     this.gender = builder.gender;
     this.address = builder.address;
 }

 @Override
 public String toString() {
     return "Person{" +
             "name='" + name + '\'' +
             ", age=" + age +
             ", gender='" + gender + '\'' +
             ", address='" + address + '\'' +
             '}';
 }

 // Static nested Builder class
 static class Builder {
     private String name;    // Required parameter
     private int age;        // Optional parameter
     private String gender;  // Optional parameter
     private String address; // Optional parameter

     // Constructor with required parameters
     public Builder(String name) {
         this.name = name;
     }

     // Methods to set optional parameters and return the Builder instance for method chaining
     public Builder age(int age) {
         this.age = age;
         return this;
     }

     public Builder gender(String gender) {
         this.gender = gender;
         return this;
     }

     public Builder address(String address) {
         this.address = address;
         return this;
     }

     // Method to build the Person object
     public Person build() {
         return new Person(this);
     }
 }
}
