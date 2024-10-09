package JavaCLass;

public class Person {
    // Fields for the Person class
    private String name;
    private int age;
    private String address;

    // Constructor for the Person class
    public  Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
     
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }

    // Main method to test the toString() method
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Print the string representation of the person object
       System.out.println(person.toString());

        // Alternatively, simply print the object, which implicitly calls the toString() method
        System.out.println(person.Person("SUNNY ",0," SELENIUMUM").toString());
    }
}

