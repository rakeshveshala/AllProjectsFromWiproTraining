package oops.practice;
import java.util.*;
public class Book {
	//private Scanner sc;
	private String title;
	private String author;
	private String isbn;
	private boolean isCheckedOut;
	public Book() {
		title = "JAVA";
		author="RAKESH";
		isbn ="ZZZ";
		isCheckedOut=true;
	}
	public void displayDetails() {
		System.out.println(title +" "+author+" "+isbn+" "+isCheckedOut);
	}
	public static void main(String[] args) {
		Book obj = new Book();
		obj.displayDetails();
	}
}
