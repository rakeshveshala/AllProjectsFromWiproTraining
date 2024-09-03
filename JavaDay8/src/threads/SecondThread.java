package threads;

public class SecondThread extends Thread {
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		for(int i=10;i>0;i--) {
			System.out.println("Printing the values: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
