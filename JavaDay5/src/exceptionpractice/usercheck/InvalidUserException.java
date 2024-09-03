package exceptionpractice.usercheck;

public class InvalidUserException extends Exception {
	public InvalidUserException() {
		super();
	}
	public InvalidUserException(String str) {
		super(str);
	}
}
