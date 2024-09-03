package generics;

public class MethodGen {
	public<k> void methodDisplay(k num2) {
		System.out.println(num2);
		System.out.println(num2.getClass().getTypeName());
	}
	public static void main(String[] args) {
		MethodGen ob = new MethodGen();
		ob.methodDisplay(5);
		MethodGen ob2 = new MethodGen();
		ob2.methodDisplay("Rakesh");
	}

}
