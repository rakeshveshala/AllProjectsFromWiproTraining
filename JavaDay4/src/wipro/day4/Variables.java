package wipro.day4;

public class Variables {
	
	static {
		System.out.println("static block");
	}
	public static void display(){
		System.out.println("method");
	}
	public Variables() {
		System.out.println("constructor");
	}
		
	public static void main(String[] args) {
		Variables obj = new Variables();
		Variables.display();
	}

}
