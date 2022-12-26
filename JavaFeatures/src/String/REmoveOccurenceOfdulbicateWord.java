package String;

import java.util.Arrays;

public class REmoveOccurenceOfdulbicateWord 
{
public static void main(String[] args) 
{
	String s1="java language. Core java sessions. Advance java";
	/*by using replace method
	String n=s1.replace("java", "");
	System.out.println(n);*/
	
	String s2[]=s1.split(" ");
	String s3[]=new String[s2.length];//to store new sentence i.e without duplicate values
    System.out.println(Arrays.toString(s2));
	int j=0;
	String s4="";
	
	for(int i=0;i<s2.length;i++)
	{
		if(!s2[i].equalsIgnoreCase("java"))
		{
			s4=s4+s2[i]+" ";
		}
	}
	System.out.println(s4);
	
	/*for(int i=0;i<s2.length;i++)
	{
		if(!s2[i].equalsIgnoreCase("java"))
		{
			s3[j]=s2[i];
			j++;
		}
	}
	//System.out.println(Arrays.toString(s3));[language., Core, sessions., Advance, null, null, null]
	for(String st:s3)
	{
		if(st!=null)
			System.out.print(st+" ");
	}
	*/
	
	
}
}
