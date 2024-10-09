package JavaCLass;

/**
 * 
 * Stratigy or Algorthim reverse of string => String="Sunny" ==> store => search
 * the predefine method to reverse the string => break the string into char
 * array => use the for loop
 * 
 * 
 * => string ko split => array of string =>
 *
 * 
 */
public class reverseofanstring {
	public void reversethechar(String str) {
		char[] str1 = str.toCharArray();
		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.print(str1[i]);

		}
		System.out.print(" ");

	}

	public static void main(String[] args) {
		String str = "Sunny is learning java";
		String[] arrayofstring = str.split(" ");
		for (int i = 0; i < arrayofstring.length; i++) {
			new reverseofanstring().reversethechar(arrayofstring[i]);
		}

	}
}
