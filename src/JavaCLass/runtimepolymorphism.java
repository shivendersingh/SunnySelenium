package JavaCLass;

public class runtimepolymorphism extends polymorphism{
	@Override
	public void addtion(int a, int b) {
	System.out.println(a*b);
	}
	public static void main(String[] args) {
		runtimepolymorphism objRuntimepolymorphism = new runtimepolymorphism();
		objRuntimepolymorphism.addition();
		objRuntimepolymorphism.addition(78, 98);// non override method
		objRuntimepolymorphism.addtion(47, 51); // override
	}
}
