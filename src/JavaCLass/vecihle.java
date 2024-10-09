package JavaCLass;

/**
 * class is an idea which need to accoplish with the help of methods/functions
 * and object
 * 
 * object is an instance of a class
 * 
 * @author shive new keyword vecihle():- constructor . (. operator use to call
 *         the methods or variable as per your wish)
 *
 *         2 kind of methods with parameter without parameter
 * 
 *         return type
 * 
 */
public class vecihle {
	String value = "Bike"; // global variable

	// 4wheeler
	/**
	 * 
	 * @param str
	 * @return STRING			
	 */
	public String fourwheeler(String str) {
		String str1 = "volvo"; // local variable
		return str + " name is :" + str1;
	}

	// 2wheeler
	public void twowheeler() {
		System.out.println(value);
	}

	public void threewheeler() {
		System.out.println("Auto");
	}

	public static void main(String[] args) {

		vecihle obj = new vecihle();// is called anonymous object
		System.out.println(obj.fourwheeler("car"));// calling method
		obj.twowheeler();
		obj.threewheeler();
		System.out.println(obj.value);// calling varibale

	}

}