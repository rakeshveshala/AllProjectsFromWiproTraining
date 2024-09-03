package filehandling.two;

import java.io.*;
public class ListAllFiles {
//	public static void displayFiles(File fdata[])
//	{
//		for(File f:fdata)
//		{
//		if (f.isDirectory())
//		{
//			System.out.println("This is folder "+f.getName());
//			File newdata[]=f.listFiles();
//			displayFiles(newdata);
//		}
//		else
//		{
//			System.out.println("Name of file is "+f.getName());
//		}
//		}
//	}
	public static void main(String[] args) {
		File fdemo=new File("C:\\WiproJava");
		File farray[]=fdemo.listFiles();
		//displayFiles(farray);
		for(File f:farray) {
			System.out.println(f);
		}
				
	}
}