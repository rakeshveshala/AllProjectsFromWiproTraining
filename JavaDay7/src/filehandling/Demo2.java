package filehandling;
import java.io.*;
public class Demo2 {

	public static void main(String[] args) {
	File file = new File("C:\\WiproJava\\sample3");
	//File farr[] = file.listFiles();
//	for(File f:farr) {
//		System.out.println(f);
//	}
	boolean b=file.renameTo(new File("C:\\WiproJava\\sample33"));
	System.out.println(b);
	}

}
