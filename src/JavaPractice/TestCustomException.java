package JavaPractice;

public class TestCustomException {

	public static void main(String[] args) {
		 try {
	            testMethod();
	        } catch (MyCheckedException e) {
	            System.out.println("Caught custom checked exception: " + e.getMessage());
	        }
	}
	 public static void testMethod() throws MyCheckedException {
	        throw new MyCheckedException("This is a custom checked exception");
	    }
}
