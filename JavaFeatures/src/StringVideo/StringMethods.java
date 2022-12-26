package StringVideo;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String s="All the best";
	System.out.println("Given String is:\n"+s);
	
    //convert String to Character array
	
	char ch[]=s.toCharArray();
	System.out.println(Arrays.toString(ch));
	
	//find the length of the given String 
	System.out.println(s.length());//the length of the sequence of characters represented by this object.
	System.out.println(ch.length);//these length property display the length of given String Array
	
   //check the character is there in string
	System.out.println("Enter character to search:");
	char c=sc.next().charAt(0);
	int cnt=0;
	for(int i=0;i<ch.length;i++)
	{
		if(c==ch[i])
		{
			cnt++;
			System.out.println("character is at "+i+" position:");		
		}
	}
	if(cnt>0)
	{
		System.out.println("character found "+cnt+" time");
	}
	else
	{
		System.out.println("character not found");
	}
	
	//find the substring
	System.out.println("find the substring:");
	System.out.println("Enter the start index:");
	int start=sc.nextInt();
	System.out.println("enter the stop index:");
	int stop=sc.nextInt();
	char subs[]=new char[stop-start+1];
	int j=0;
	for(int i=start;i<=stop;i++)
	{
		subs[j]=ch[i];
		j++;
	}
	String substr=new String(subs);
	System.out.println("SubString :"+substr);
}
}
