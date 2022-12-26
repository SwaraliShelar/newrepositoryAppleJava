package String;

import java.util.Arrays;

public class DisplayFirstCharacterOfString
{
public static void main(String[] args) 
{
	String s1 = "hi";
	String s2 = "Hello";
	String s3 = "how";
	
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	char c3[]=s3.toCharArray();
	
	for(int i=0;i<c1.length;i++)
	{
		System.out.println(c1[i]+""+c2[i]+""+c3[i]);
		System.out.println(c2[i+2]+""+c3[i+2]);
		System.out.println();
	}
}
}
	
	
/*
	//0th index of character of string
	System.out.print(s1.charAt(0));
	System.out.print(s2.charAt(0));
	System.out.println(s3.charAt(0));
	
	//1st index of character of string
	System.out.print(s1.charAt(1));
	System.out.print(s2.charAt(1));
	System.out.println(s3.charAt(1));
	
	//2nd index of character of string
	System.out.print(s2.charAt(2));
	System.out.println(s3.charAt(2));
	
	//3rd index of character of string
	System.out.println(s2.charAt(3));
	
	//4th index of character of string
	System.out.println(s2.charAt(4));
	*/
