package threads.syncronization;

public class Thread1 extends Thread {
	Table tobj;
	public Thread1(Table tobj) {
		this.tobj=tobj;
	}
	public void run(){
		tobj.printTable(7);
	}
}
