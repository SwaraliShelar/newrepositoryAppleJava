package StringAssignment;

import java.util.Arrays;

public class ReverseString 
{
public static void main(String[] args) 
{
	String ori="Good Morning";
	String rev="";
	for(int i=ori.length()-1;i>=0;i--)
	{
		rev=rev+ori.charAt(i);
	}
	System.out.print("original:"+ori+"\nReverse:"+rev);
	/*
	String s="java programming";
	String  s1[]=s.split(" ");
	System.out.println(Arrays.toString(s1));
	for(int i=0;i<s1.length;i++)
	{
		char ch[]=s1[i].toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}
		System.out.print(" ");
	}
	
	System.out.println("\n");
	
	for(int i=0;i<s1.length;i++)
	{
		for(int j=s1[i].length()-1;j>=0;j--)
		{
			System.out.print(s1[i].charAt(j));
		}
		System.out.print(" ");
	}*/
}
}
