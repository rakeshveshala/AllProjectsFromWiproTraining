package exceptionpractice;

public class InvalidAgeException extends Exception{
	@Override
	public String getMessage() {
		return "trying to entrer invalid age";
	}
}
