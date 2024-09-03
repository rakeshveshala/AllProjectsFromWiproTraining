package arrayofobjects;
import java.util.*;
public class Aobt {
	private Scanner sc;
	private Aobo arr[];
	public Aobt() {
		sc=new Scanner(System.in);
		System.out.println("enter the no of products required");
		int num = sc.nextInt();
		arr=new Aobo[num];
	}
	public void insert() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Aobo();
			System.out.println("enter the product name: ");
			arr[i].setName(sc.next());
			System.out.println("enter the product cost: ");
			arr[i].setCost(sc.nextInt());
		}
	}
	public void display() {
		for(Aobo p:arr) {
			System.out.println(p.getCost()+" "+p.getName());
		}
	}
	
}
