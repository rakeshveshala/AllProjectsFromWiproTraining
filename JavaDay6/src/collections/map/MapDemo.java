package collections.map;
import java.util.*;
public class MapDemo {
	private Scanner sc;
	private Map<Integer,String> mpad;
	public MapDemo() {
		sc=new Scanner(System.in);
		mpad=new HashMap<>();
	}
	public void insert() {
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		String b=sc.next();
		mpad.put(a,b);
//		mpad.put(2, "hloo");
//		mpad.put(3, "hey");
	}
	public void display() {
		Set<Map.Entry<Integer,String>> mpset = mpad.entrySet();
		for(Map.Entry<Integer, String> entry:mpset) {
			System.out.println("key is"+entry.getKey());
			System.out.println("value is"+entry.getValue());
		}
	}
	public void delete() {
		System.out.println("enter the key to delete");
		int key = sc.nextInt();
		mpad.remove(key);
	}
	public static void main(String[] args) {
		MapDemo obj = new MapDemo();
		obj.insert();
		obj.display();
		obj.delete();
		obj.display();
	}

}
