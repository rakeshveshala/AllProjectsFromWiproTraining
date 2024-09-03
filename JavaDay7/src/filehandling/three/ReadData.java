package filehandling.three;
import java.io.*;
public class ReadData {
	FileInputStream inputstream;
	public ReadData() {
		try {
			inputstream = new FileInputStream("C:\\WiproJava\\sample1.txt");
			int input=0;
			while((input=inputstream.read())!=-1) {
				System.out.print((char)input);
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		ReadData rd = new ReadData();

	}

}
