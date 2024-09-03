package wipro.day4;

public class Singleton {
	private static Singleton singleObj;
	private Singleton() {
		
	}
	public static Singleton getObj(){
		singleObj = new Singleton();
		return singleObj;
	}
	public void display() {
		System.out.println("singleton practice");
	}
}
