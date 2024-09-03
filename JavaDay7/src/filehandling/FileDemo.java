package filehandling;
import java.io.*;
public class FileDemo {
	private File fobj1,fobj2;
	public FileDemo() {
		fobj1=new File("C:\\WiproJava\\sample2");
		fobj2=new File("C:\\WiproJava");
	}
	public void display() {
		System.out.println("is readable or not"+fobj1.canRead());
		System.out.println("is directory or not"+fobj2.isDirectory());
		boolean b=fobj1.renameTo(new File("C:\\WiproJava\\sample222"));
		String filenames[]=fobj2.list();
		for(String name:filenames) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		FileDemo obj = new FileDemo();
		//obj.display();
	}

}
