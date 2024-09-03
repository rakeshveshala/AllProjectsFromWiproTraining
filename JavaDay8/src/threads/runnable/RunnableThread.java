package threads.runnable;

public class RunnableThread implements Runnable {
	public void run() {
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d\n",num,i,num*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		RunnableThread r1=new RunnableThread();
		Thread t1=new Thread(r1);
		t1.start();
	}
}
