package JavaCLass;

public class inherit extends OOP {

	public int multipication(int a, int b) {

		return a * b;
	}
}

class child extends inherit {

	public int substraction(int a, int b) {
		return a - b;

	}
}

class finalchild {
	public static void main(String[] args) {
	//multilevel
		child obj = new child();
	//	System.out.println("Multipication of two numbers :-" + obj.multipication(7, 8));
		
		
	//hirarchical
		System.out.println("Substration of two numbers :-" + obj.substraction(8, 7));
		System.out.println("Addition of two numbers :-" + obj.addition(7, 8));
		
	}
}