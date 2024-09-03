package threads.syncronizationpractice;

public class Thread1 extends Thread{
	BankAccount obj;
	public Thread1(BankAccount obj) {
		this.obj=obj;
	}
	public void run() {
		obj.withdraw(5000);
	}
}
