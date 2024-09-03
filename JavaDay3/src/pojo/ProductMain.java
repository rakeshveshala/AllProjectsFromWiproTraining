package pojo;
import java.util.*;
public class ProductMain {
	private Scanner sc;
	Product obj;
	public ProductMain() {
		sc=new Scanner(System.in);
		obj = new Product();
	}
	public void accaeptDetailes() {
		sc = new Scanner(System.in);
		System.out.println("enter productid:");
		obj.setProductid(sc.nextInt());
		System.out.println("enter product name:");
		obj.setProductName(sc.next());
		System.out.println("enter quantity:");
		obj.setQauntity(sc.nextInt());;
	}
	public void displayDetailes() {
		System.out.println(obj.getProductid()+" "+obj.getProductName()+" "+obj.getQauntity());
	}
	public static void main(String[] args) {
		ProductMain obj2 = new ProductMain();
		obj2.accaeptDetailes();
		obj2.displayDetailes();
	}

}
