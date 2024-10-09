package JavaCLass;

/**
 * 
 * xyz your company when 1 time you go for an interview they give token card
 * 
 * that token card is not mean for there emplopye only for you
 * 
 * can we consider it as public
 * 
 * 
 * 
 *
 */
public class AccessModifier {
	
	 int a =4;
	 void additionoftwonumber() {
		System.out.println("addition of 2 number :-"+ (a+9));
	}

	public static void main(String[] args) {
		new AccessModifier().additionoftwonumber();
		System.gc();
		
	}
}
