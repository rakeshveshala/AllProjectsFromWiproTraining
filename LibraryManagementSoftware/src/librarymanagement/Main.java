package librarymanagement;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User obj=new User();
		System.out.println("Enter 1 for Admin\n2 for Librarian");
		int ch1=sc.nextInt();
		if(ch1==1) {
			Admin obj2=new Admin();
			obj2.menu1();
		}
		else if(ch1==2) {
			Librarian obj3=new Librarian();
			obj3.menu2();
		}
		else {
			System.out.println("Please choose properly");
		}
	
	}

}
