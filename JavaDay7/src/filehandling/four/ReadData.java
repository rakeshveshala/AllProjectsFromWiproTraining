package filehandling.four;

import java.io.*;

public class ReadData {
  FileInputStream inputstream;
  FileOutputStream outputstream;
  FileWriter fileWriter;
  public ReadData() 
  {
    try
    {
      inputstream = new FileInputStream("C:\\WiproJava\\sample1.txt");
      outputstream = new FileOutputStream("C:\\WiproJava\\sample3.txt");
      System. out.println ("Reverse String") ;
      byte data []=inputstream.readAllBytes ();
      System. out.println ("length of data is "+data. length) ;
      for(int x=data.length-1;x>=0;x--)
      {
    	  System. out.print ((char) data[x]);
    	  outputstream.write((char)(data[x]));
      }
    }
    catch(FileNotFoundException ex)
    {
      System.out.println(ex.getMessage());
    }
    catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    
  }
  
  public static void main(String[] args)
  {  
      ReadData rd = new ReadData();
 
  }

}