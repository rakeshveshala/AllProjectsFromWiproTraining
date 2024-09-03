package threads.one;

public class SecondThread extends Thread {
	public void run() {
		int num=7;
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
}
