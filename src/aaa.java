public class aaa {

    // Method using varargs
    public void myMethod(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        Example obj = new Example();

        // Pass any number of parameters
        obj.myMethod("one", "two", "three");
    }
}
