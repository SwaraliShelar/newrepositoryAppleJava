package String;

import java.util.Arrays;

public class UsingSplitMethodStringReverse
{
public static void main(String[] args)
{
	/*String s1="hello@world@language";//also use ("#") also use space(" ")
	String s[]=s1.split("@");
	System.out.println(Arrays.toString(s));*/
	
	/*String s2="Java#is#good#programming#language";
    String str2[]=s2.split("#");	//(" ") split into the String array
	System.out.println(Arrays.toString(str2));*/
	
	String s1="Java is good programming language";
	
    String str[]=s1.split(" ");	//(" ") split into the String array

	System.out.println(Arrays.toString(str));
	
	
	//reversing of  the string array

	for(int i=0;i<str.length;i++)
	{
		char ch[]=str[i].toCharArray();
		for(int j=ch.length-1;j>=0;j--)//returns length of character in ch
		{
			System.out.print(ch[j]);
		}
		System.out.print(" ");//System.out.println();
	
		/*for(int j=str[i].length()-1;j>=0;j--)//Returns the length() of this string array.
		{
			System.out.print(str[i].charAt(j));
		}
		System.out.print(" ");*/
	}
}
}
	
		
	

	

