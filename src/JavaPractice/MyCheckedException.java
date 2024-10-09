package JavaPractice;

public class MyCheckedException extends Exception {
	public MyCheckedException() {
		super();
	}

	public MyCheckedException(String message) {
		super(message);
	}

	public MyCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	// Constructor that accepts a cause
	public MyCheckedException(Throwable cause) {
		super(cause);
	}
}
