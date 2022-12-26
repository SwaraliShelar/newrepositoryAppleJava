package StringAssignment;

import java.util.Scanner;

//20.Write a Java program to remove all extra blank spaces from a given string.
public class RemoveAllExtraBlankSpecaseFromString
{
public static void main(String[] args) 
{
	/*
	by using replaceAll() we remove all the white spaces available at string
	Use the replaceAll to remove the regular expression \\s that finds all white space characters (tabs, spaces, newline characters, etc.)
	in the string with ""(empty space literal).
		
	String str="        india is my coutry     ";
	System.out.println("before:"+str);
	String str1=str.replaceAll("\\s","");
	System.out.println("After Removing Whitespaces:"+str1);
    */

Scanner sc=new Scanner(System.in);
System.out.println("enter the String:");
String s=sc.nextLine();
char ch[]=s.toCharArray();
StringBuffer sbf=new StringBuffer();//Declare a StringBuffer variable.
for(int i=0;i<ch.length;i++)
{
	if(ch[i]!=' ' && ch[i]!='\t')//Use an if condition to check for white spaces.
	{
		sbf.append(ch[i]);
	}
}
String str=sbf.toString();//Convert a string buffer to a string
System.out.println("Removing all the white space from the string is:"+str);
}
}
