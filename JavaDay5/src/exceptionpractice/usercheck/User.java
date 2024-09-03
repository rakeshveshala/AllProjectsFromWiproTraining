package exceptionpractice.usercheck;

import java.util.Scanner;

public class User {
	protected Scanner sc;
	private String password;
	private String username;
	
	public User() {
		sc=new Scanner(System.in);
	}
	public void checkPass() throws InvalidUserException {
		System.out.println("Enter password: ");
		password=sc.next();
		System.out.println("Enter username: ");
		username=sc.next();
		if(!password.equals("admin") && !username.equals("admin") ) {
			throw new InvalidUserException();
		}
	}
	public static void main(String[] args) {
		User obj = new User();
		try {
			obj.checkPass();
		}
		catch(InvalidUserException ex) {
			System.out.println("INVALID");
		}
	}

}
