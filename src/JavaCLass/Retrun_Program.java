package JavaCLass;
/**
 * 
 * write the code where method take the one value from global and one value from paramter
   and return from the method and print down them after calling from an object?
 *
 */
public class Retrun_Program {
/**
 * 
 * @param a
 * @param b
 * @return
 */
	public int addition(int a, int b) {

		return a + b;

	}

	public int substraction(int a, int b) {
		return a - b;

	}

	public int multipication(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {
		Retrun_Program obj = new Retrun_Program();
		System.out.println("Addition of two numbers :-" + obj.addition(7, 8));
		System.out.println("Multipication of two numbers :-" + obj.multipication(7, 8));
		System.out.println("Substration of two numbers :-" + obj.substraction(8, 7));

	}

}
