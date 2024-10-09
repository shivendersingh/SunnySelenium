package JavaPractice;

/*public static void main(String[] args) {

InheritPractice ip = new InheritPractice();

System.out.println("I want to travel to-  " +ip.Travel("Goa", "India")); 
}*/
	
public class InheritPractice extends Oops_Practice{
	
public String bags(String a,String b) 
	
	{
		
		String c= a+","+b;
		return c;
	}

}


 class child extends InheritPractice {
	
	public static void main(String[] args) {

		child ch = new child();

		System.out.println("I want to travel to-  " +ch.Travel("Delhi","India"));
		System.out.println("Colors of bags are-  " +ch.bags("Red","Blue"));

	}
	
 }

