package String;

import java.util.Arrays;

public class StringReverse 
{
public static void main(String[] args) 
{
	String str="java is easy language";
	String s[]=str.split(" ");//split by using space
	
	System.out.println(Arrays.toString(s));
	for(int i=0;i<s.length;i++)//for split string
	{
		char c[]=s[i].toCharArray();//splits string is converted into character
		for(int j=c.length-1;j>=0;j--)//for character
		{
			System.out.print(c[j]);
		}
		System.out.print(" ");
	}
	
	
	System.out.println("\n");
	
	

	System.out.println(Arrays.toString(s));
	for(int i=0;i<s.length;i++)//for split string
	{
		for(int j=s[i].length()-1;j>=0;j--)//for split string
		{
			System.out.print(s[i].charAt(j));
		}
		System.out.print(" ");
	}
	
}
}
