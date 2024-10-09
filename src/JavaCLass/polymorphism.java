package JavaCLass;

/**
 * polymorphism:- poly- morph poly:- many motph :- forms
 * 
 * when we can use same methods with different form we called it as polymorphism
 * type of polymorphism:- 1) methodoverloafding (complitime polymorphism) 2)
 * overriding(runtime poly morphism)
 * 
 * 
 * methodoverloading public static void main(String[] args) {
 * 
 * polymorphism objPolymorphism = new polymorphism();
 * objPolymorphism.addition(); objPolymorphism.addition(7, 10);
 * 
 * }
 * 
 */
public class polymorphism {

	public void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public void addition(int a, int b) {

		System.out.println(a + b);
	}

	public void addtion(int a, int b) {
		
		System.out.println("Addition of two number :-"+(a+b));
		
	}

}
