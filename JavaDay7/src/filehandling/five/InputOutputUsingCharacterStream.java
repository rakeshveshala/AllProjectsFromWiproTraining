package filehandling.five;
import java.io.*;
public class InputOutputUsingCharacterStream {
	FileReader freader;
	FileWriter fwriter;
	String s;
	char ch[];
	public InputOutputUsingCharacterStream()throws IOException
	{
		freader=new FileReader("C:\\WiproJava\\sample1.txt");
		BufferedReader bufferedReader=new BufferedReader(freader);
		fwriter=new FileWriter("C:\\WiproJava\\sample1.txt",true);
	}
	public void readData()throws IOException
	{
		 ch=new char[45];
		freader.read(ch);
		for(int x=0;x<ch.length;x++)
		{
			System.out.print(ch[x]);
		}
		
	}
	public void writeData()throws IOException
	{
		System.out.println("Length of array is "+ch.length);
		fwriter.write(ch);
		fwriter.flush();
	}
	public static void main(String[] args) {
		try
		{
		InputOutputUsingCharacterStream iobj=new InputOutputUsingCharacterStream();
		iobj.readData();
		iobj.writeData();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
			
		}
	}
}
