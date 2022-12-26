package WrittenTest9;
/*2.Write a Java program to find total number of alphabets,
digits or special character in a string.*/

import java.util.Scanner;

public class DigitsCharacterCount 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a alphabate,digit and special characters:");
	String s=sc.nextLine();
	int alpha,dig,spe;
	alpha=dig=spe=0;
	char ch;
	for(int i=0;i<s.length();i++)
	{
	    ch=s.charAt(i);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			alpha++;
		}
		else if(ch>='0' && ch<='9')
		{
			dig++;
		}
		else 
		{
			spe++;
		}
	}
	System.out.println("\nNumber of alphabate available in character:"+alpha);		
	System.out.println("number of digits available in character:"+dig);
	System.out.println("number of special character availble in character:"+spe);
			
	}	
}
