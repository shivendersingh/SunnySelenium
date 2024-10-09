package JavaCLass;

/**
 * 
 * EN capsul ation
 * 
 * capsul :- you don't know which medicine you are been taken
 * 
 * to show that in java means user want to hide the data or variable for further
 * usage with the help of what getter and setter
 * 
 * this is a keyword which help you to point out the global variable
 *
 */
public class Encapsulation {

	private  int a = 10; // global variable
	private  int b = 20;
	private String name = "Shivender";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		//System.out.println("old value of a:-"+this.a);
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		Encapsulation enobject = new Encapsulation();
		System.out.println("old value of a:- "+enobject.a);
		enobject.setA(70);
		System.out.println("new value of a variable a :- "+enobject.a);
		
	}
}

