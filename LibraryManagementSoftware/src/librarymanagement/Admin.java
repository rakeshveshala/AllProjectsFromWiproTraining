package librarymanagement;
import java.util.*;
public class Admin extends User {
	
	public void add() {
		System.out.println("How many books you wanna add:\n");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the book name");
			books.add(sc.next());
		}
		System.out.println();
	}
	protected void view() {
		System.out.println("Added books are:\n");
		for(String s:books) {
			System.out.println(s);
		}
		
	}
	protected void delete() {
		System.out.println("How many books you want to delete");
		int num=sc.nextInt();
		String old="";
		for(int i=0;i<num;i++) {
			System.out.println("Enter the book you want to delete");
			old=sc.next();
			books.remove(old);
			
			}
	
	}
	
	protected void logout() {
		System.out.println("You Are Logged Out");
		System.out.println();
	}
	protected void menu1() {
		String choice="yes";
		while(choice.equalsIgnoreCase("yes")) {
			System.out.println("enter 1 for add books\n2 for view books\n3 for delete books\n4 for logout");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				add();
				break;
			case 2:
				view();
				break;
			case 3:
				delete();
				break;
			case 4:
				logout();
				break;
			}
			System.out.println("enter yes to continue no for stop");
			choice = sc.next();
		}
	}
	
}
