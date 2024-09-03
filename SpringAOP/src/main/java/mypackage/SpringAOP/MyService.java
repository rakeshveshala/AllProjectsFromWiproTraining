package mypackage.SpringAOP;

public class MyService {
	public void insert(){
		System.out.println("Doing addition in Ban Account class");
	}
	public void delete(){
		System.out.println("Doing deleting in Account");
	}
	public void message1() {
		System.out.println("this is message 1 from bank");
	}
	public void message2() {
		System.out.println("this is message 2 from bank");
	}
	public void show(){
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
