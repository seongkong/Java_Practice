public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "No name yet";
        this.age = 0;
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Setter for name with first and last name
    public void setName(String first, String last) {
        this.name = first + " " + last;
    }

    // Setter for name with full name
    public void setName(String name) {
        this.name = name;
    }

    // Static method to create a toddler
    public static Person createToddler() {
        return new Person("A toddler", 2);
    }

    // Static method to create a preschooler
    public static Person createPreschooler() {
        return new Person("A preschooler", 5);
    }

    // Static method to create an adolescent
    public static Person createAdolescent() {
        return new Person("An adolescent", 9);
    }

    // Static method to create a teenager
    public static Person createTeenager() {
        return new Person("A teenager", 15);
    }

    // Static method to create an adult
    public static Person createAdult() {
        return new Person("An adult", 21);
    }
}
