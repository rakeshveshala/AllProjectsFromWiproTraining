package threads.syncronizationpractice;

public class Main {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		Thread1 t1= new Thread1(obj);
		Thread2 t2= new Thread2(obj);
		t1.start();
		t2.start();
	}

}
