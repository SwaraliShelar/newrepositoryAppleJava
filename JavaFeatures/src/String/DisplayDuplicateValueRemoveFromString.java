package String;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayDuplicateValueRemoveFromString 
{
public static void main(String[] args)
{
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a String:");
	s=sc.nextLine();
	String s1[]=s.split(" ");
	System.out.println("Duplicate Value:");
	for(int i=0;i<s1.length;i++)
	{
		for(int j=i+1;j<s1.length;j++)
		{
			if(s1[i].equalsIgnoreCase(s1[j]))
			{
				System.out.print(s1[j]+" ");
			}
		}
	}
	
}
}
