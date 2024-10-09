package ExceptioHandling;

public class exceptionwork extends Customizeexception {

	public static void main(String[] args) {
		try {
			new exceptionwork().myexcption();
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
