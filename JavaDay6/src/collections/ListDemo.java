package collections;

import java.util.*;
import java.util.Scanner;

public class ListDemo {
	private Scanner sc;
	private List<String> list;
	public ListDemo() {
		sc=new Scanner(System.in);
		list = new ArrayList<>();
	}
	public void insert() {
		System.out.println("Enter how many elements you want to insert");
		int noofelements=sc.nextInt();
		for(int i=0;i<noofelements;i++) {
			System.out.println("Enter elements:");
			list.add(sc.next());
		}
	}
	public void delete() {
		System.out.println("Enter element which you want to delete");
		String deleteval=sc.next();
		list.remove(deleteval);
	}
	public void view() {
		for(String s:list) {
			System.out.println("Entered value: "+s);
		}
	}
	public void update() {
		System.out.println("Enter element which you want to update ");
		String update=sc.next();
		int indexUpdate = list.indexOf(update);
		System.out.println("Enter the new value to update");
		String newValue=sc.next();
		list.set(indexUpdate, newValue);
	}
	public void menu() {
		String choice ="y";
		while(choice.equals("y")) {
			System.out.println("select 1 for insert method");
			System.out.println("select 2 for delete method");
			System.out.println("select 3 for view method");
			System.out.println("select 4 for update method");
			System.out.println("enter 5 to exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:insert();
				break;
			case 2:delete();
			break;
			case 3:view();
			break;
			case 4:update();
			break;
			case 5:System.exit(0);
			}
			System.out.println("Do you want to continue\nEnter y to continue");
			choice=sc.next();
		}
	}

}
