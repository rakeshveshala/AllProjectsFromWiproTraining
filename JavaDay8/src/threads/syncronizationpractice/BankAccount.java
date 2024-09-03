package threads.syncronizationpractice;

public class BankAccount {
	public int amount=10000;
	public void withdraw(int balance) {
		if(balance>amount) {
			System.out.println("insufficient funds");
		}
		else {
			System.out.println(amount-balance);
		}
	}	
}
