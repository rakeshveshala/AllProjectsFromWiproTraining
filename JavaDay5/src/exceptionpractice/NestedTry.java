package exceptionpractice;

public class NestedTry {

	public static void main(String[] args) {
		try {

			System.out.println("try outer");
			String str=null;
			System.out.println(str.length());
			
		    try {
		    	System.out.println("try inner");
				System.out.println(8/0);
		    }
		    catch (ArithmeticException e2) {
		        System.out.println("AE");
		    }
		}
		catch (NullPointerException e1) {
			System.out.println("2nd Ex");
		}
		}

}

