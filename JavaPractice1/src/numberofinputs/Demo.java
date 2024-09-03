package numberofinputs;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[50];
		int counter=0;
		while(sc.hasNextLine())
		{
			String value=sc.nextLine().trim();
			if(value.isEmpty())
			{
				break;
			}
	
				double val=Double.parseDouble(value);
				
			arr[counter]=val;
			counter++;
				
		}
        double max=0;
        for(int i=0;i<counter;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    
		System.out.println("MAximum is "+max);
	
		
		
	
	}

}