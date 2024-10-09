package JavaPractice;

public class TestCustomexc {

	public static void main(String[] args) {
		try {
			testMethod();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void testMethod() throws ArithmeticException {
		throw new ArithmeticException("This is a custom checked exception");
	}
}
