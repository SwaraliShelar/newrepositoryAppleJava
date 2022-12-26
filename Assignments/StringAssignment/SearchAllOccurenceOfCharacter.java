package StringAssignment;

import java.util.Scanner;

//15.Write a Java program to search all occurrences of a character in given string.
public class SearchAllOccurenceOfCharacter 
{
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence:");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	System.out.println("enter a character occurence you want to find:");
	char c=sc.next().charAt(0);
	int cnt=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==c)
		{
			cnt++;
		}
	}
	System.out.println("occurrences of "+ch+" in given string:"+cnt);

	
}
}
