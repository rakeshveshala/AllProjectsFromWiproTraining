package exceptionpractice;

public class NegativeNumberException extends Exception {
	public String getMessage() {
		return "trying to enter negative number";
	}
}
