package threads.syncronizationpractice;

public class Thread2 extends Thread{
	BankAccount obj;
	public Thread2(BankAccount obj) {
		this.obj=obj;
	}
	public void run() {
		obj.withdraw(15000);
	}
}
