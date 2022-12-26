package StringAssignment;
//14.Write a Java program to find first occurrence of a word in a given string.
import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurenceOfWordInString 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	         //01234567890111213141516
	String s1="hello good morning have a good day";
	String s2="good";
	int value=s1.indexOf(s2);
	System.out.println("the first occurence of the string is:"+value);

	String s3="is there is anyone";
   System.out.println("the Substring(word) is available at :"+s3.indexOf("is", 3));
	//index is start from 3

	
	
	
	
	
	
	
	
	
	
	
/*	Scanner sc=new Scanner(System.in);
	//String s1="india is my country india is the beautiful country in the world";
	System.out.println("enter the sentence:");
	String s1=sc.nextLine();
	String s2[]=s1.split(" ");
	System.out.println(Arrays.toString(s2));
	System.out.println("enter the word to find the first occurence:");
	String s=sc.next();
	int cnt=0;
	for(int i=0;i<s2.length-1;i++)
	{
		
        if(s2[i].equalsIgnoreCase(s))
		{
			cnt++;
		}
	}
	System.out.println("Occurence of the "+s+" in string is "+cnt+" times ");*/

}
}
