package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;

//11.Write a Java program to count occurrences of a character in given string.
public class CountOccurenceOfGivenString 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String str1="india is my country";
	
    char ch[]=str1.toCharArray();
	System.out.println(Arrays.toString(ch));
	System.out.println("Enter character to search:");
	char c=sc.next().charAt(0);
	int cnt=0;
	for(int i=0;i<ch.length;i++)
	{
		if(c==ch[i])
		{
			
		cnt++;	
		System.out.println("occurence of the character at the "+ i +" position ");
		
		}
	}
	System.out.println("in the given String:"+cnt);
}	
}
