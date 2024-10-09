package ExceptioHandling;

/**
 * 
 * Expetion Vs Error Error is someting which you can able to resolved Exception
 * you may or may not resolved
 * 
 * Herirarchy of an exception
 * 
 * run time exception compile time exception try-catch
 * 
 * does on try has many catches 
 * yes
 * catch (ArithmeticException e) {

			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("exception found");
			r.printStackTrace();
		}
 *
 */
public class ExceptionHand extends Customizeexception{

	private void mathetics() {

		try {
			int ar[] = { 1, 2, 3, 4, 5 };
	        for (int i = 0; i <= ar.length; i++)
	            System.out.println(ar[i]);
		} catch (Exception e) {
			new ExceptionHand().myexcption();
		}

	}

	public static void main(String[] args) {

		new ExceptionHand().mathetics();
	}

}
