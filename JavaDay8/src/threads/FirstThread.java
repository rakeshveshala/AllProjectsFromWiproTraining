package threads;

public class FirstThread extends Thread{
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("Printing the values: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		FirstThread t1= new FirstThread();
		//t1.setName("MyFirstThread");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SecondThread t2= new SecondThread();
		//t2.setName("MySecondThread");
		t2.start();
	}

}
