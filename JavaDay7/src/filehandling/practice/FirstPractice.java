package filehandling.practice;
import java.io.*;
public class FirstPractice {
	public void insert() {
		try {
			File file=new File("C:\\WiproJava\\sample1.txt");
			FileWriter filewriter=new FileWriter(file,true);
			filewriter.write("THIS IS MY FIRST PRACTICE FOR FILE HANDLING");
			filewriter.flush();
			filewriter.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public void read() {
		try {
			File file = new File("C:\\WiproJava\\sample1.txt");
			FileReader fileReader = new FileReader(file);
			int myChar=0;
			while((myChar=fileReader.read())!=-1) {
				System.out.print((char)myChar);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)  {
		FirstPractice obj = new FirstPractice();
		//obj.insert();
		obj.read();
	}

}
