package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;

//13.Write a Java program to count total number of words in a string.
public class CountOccurenceOfThewordInString
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentance:");
	String str=sc.nextLine();
	int cnt=0;
	for(int i=0;i<str.length();i++)
	{	
		
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			cnt++;
	}
	System.out.println("total number of word present at string:"+(cnt+1));
}
}
