package threads.syncronization;

public class Main {

	public static void main(String[] args) {
		Table tobj = new Table();
		Thread1 t1=new Thread1(tobj);
		Thread2 t2=new Thread2(tobj);
		t1.start();
		t2.start();
	}

}
