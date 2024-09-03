package arrayofobjects;
import java.util.*;
public class Two {
	private Scanner sc;
	private One arr[];
	public Two() {
		sc=new Scanner(System.in);
		System.out.println("enter how many products");
		int numObj=sc.nextInt();
		arr=new One[numObj];
	}
	public void insert() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=new One();
			sc = new Scanner(System.in);
			System.out.println("enter productid:");
			arr[i].setProductid(sc.nextInt());
			System.out.println("enter quantity:");
			arr[i].setQauntity(sc.nextInt());;
		}
	}
	public void display() {
		for(One p:arr) {
			System.out.println(p.productid+" "+p.getQauntity());
		}
	}
	public void delete() {
		System.out.println("enter id to delete:");
		int pid = sc.nextInt();	
		One pdelete =null;
		
	}
	public static void main(String[] args) {
		Two obj2 =new Two();
		obj2.insert();
		obj2.display();
	}

}
