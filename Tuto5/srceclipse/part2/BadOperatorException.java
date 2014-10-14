package part2;

public class BadOperatorException extends Exception {

	public BadOperatorException() {
		super();
	}

	public BadOperatorException(String message) {
		super(message);
	}

	public BadOperatorException(Throwable cause) {
		super(cause);
	}

	public BadOperatorException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadOperatorException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
