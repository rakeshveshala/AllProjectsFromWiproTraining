package com.wipro.training;
import java.util.*;
public class FrequencyProblem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String s=sc.next();
	   if (s == null || s.isEmpty()) {
        //  return 0; // No moves needed for an empty string
		   System.out.println("Empty string");
      }
	   //Hello
      int[] frequency = new int[26];
      //String str[]={"hello","java","Welcome"}
    //  for(String s:str)
      //abddccc
      for(char c : s.toCharArray()) {
          frequency[c - 'a']++;//it will increment the value at 0th position
         //97-97
          //if b is coming it will increment the value at 1st position
         
      }
      int maxFrequency = 0;
      for (int freq : frequency) {
          if(freq > maxFrequency) {
              maxFrequency = freq;
          }
      }
      //helloddd  8
      //maximum  3
      int minMoves = s.length() - maxFrequency;
      System.out.println("Min moves are "+minMoves); //min moves required to go to the max occurance.
 
}
}
