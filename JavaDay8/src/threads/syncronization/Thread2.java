package threads.syncronization;

public class Thread2 extends Thread{
	Table tobj;
	public Thread2(Table tobj) {
		this.tobj=tobj;
	}
	public void run() {
		tobj.printTable(5);
	}
}
