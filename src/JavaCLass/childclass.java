package JavaCLass;

/**
 * multiple inhertiance where child can't extends the multiple class at time
 * 
 * how we can achichive the multiple inhertiance? with the help of interface or
 * abstraction
 * 
 * 2) abtstraction Abstraction means when user try to secure or hide the
 * implementation of a methods called abstraction
 * 
 * what is the difference between interface and abstraction
 *
 *override
 * when a subclass (child class) has the same method as the parent class.
 * 
 * wrapper class
 * 
 */
public class childclass implements fatherinter, motherinterface {

	@Override
	public void inteligence() {

		System.out.println("inteligence");
		System.out.println(10+20);
	}

	@Override
	public void hairloss() {
		System.out.println("hairloss");
	}

	@Override
	public void observation() {
		System.out.println("observation");

	}

	@Override
	public void disiciplene() {
		System.out.println("he has disiciplene");

	}
	
	public void sharpbrain() {
		System.out.println("sharpbrain");

	}

}
