package com.wipro.training;
import java.util.*;
public class PracticeTwo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i=0;i<words.length;i++){
            StringBuffer buffer = new StringBuffer(words[i]);
            result.append(buffer.reverse()+" ");
        }
        System.out.println(result);
    }
}
