package collections.map;
import java.util.*;
public class MapPractice {
	private Scanner sc;
	private Map<String,String> mpad;
	public MapPractice() {
		sc=new Scanner(System.in);
		mpad=new HashMap<>();
	}
	public void insert() {
		mpad.put("hi","hii");
		mpad.put("helo", "hloo");
		mpad.put("heyyy", "hey");
	}
	public void display() {
		Set<Map.Entry<String,String>> mpset = mpad.entrySet();
		for(Map.Entry<String, String> entry:mpset) {
			System.out.println("key is"+entry.getKey());
			System.out.println("value is"+entry.getValue());
		}
	}
	public void delete() {
		System.out.println("enter the key to delete");
		String key = sc.next();
		mpad.remove(key);
	}
	public static void main(String[] args) {
		MapPractice obj = new MapPractice();
		obj.insert();
		obj.display();
		obj.delete();
		obj.display();
	}

}
