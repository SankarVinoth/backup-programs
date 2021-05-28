package in.sankarvinoth.exception;

public class InValidUserException extends RuntimeException {
	/**
	 * userdefined exception method for invaliduser details
	 * 
	 * @param message
	 */
	public InValidUserException(String message) {
		super(message);
	}
}
