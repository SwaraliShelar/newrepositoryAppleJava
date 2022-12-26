package StringAssignment;

import java.util.Scanner;

//22.Write a Java program to count total number of vowels and consonants in a string.
public class CountTotalNumberOfConsonatsAndVowels 
{
public static void main(String[] args)
{
	
	String s1="Can I Talk To You Later";
	s1=s1.toLowerCase();
	int ccnt=0;
	int vcnt=0;
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'  || s1.charAt(i)=='o'  ||s1.charAt(i)=='u')
		{
			ccnt++;
		}
		else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		{
			vcnt++;
		}
	}
	System.out.println("number of vowels in String is:"+vcnt);
	System.out.println("number of consonants in String is:"+ccnt);

}
	
}

