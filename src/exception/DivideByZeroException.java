package exception;

public class DivideByZeroException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DivideByZeroException() {
		super();
	}

	DivideByZeroException(String msg) {
		super(msg);
	}

}
