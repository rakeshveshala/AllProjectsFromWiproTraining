package practice1;
import java.util.*;

public class ExceptionMain {
	private static int num;
	private static Scanner sc;
	private static ExceptionMain[] arr;
	public ExceptionMain() {
		
		
	}
	public void checkCondition() throws MulipleOfException {
		
		System.out.println("enyter the number:\n");
		num=sc.nextInt();
		if(num ==0) {
			System.out.println("you entered zero\n");
		}
		else if(num%10==0) {
			throw new MulipleOfException();
		}
		else {
			System.out.println("IT IS NOT MULTIPLE OF 10\n");
		}
	}
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("how many check iterations do you want: ");
		int chk = sc.nextInt();
		arr = new ExceptionMain[chk];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new ExceptionMain();
			try {
				arr[i].checkCondition();
			}
			catch(MulipleOfException eh) {
				System.out.println(eh.getMessage());
			}

		}
	}

}



