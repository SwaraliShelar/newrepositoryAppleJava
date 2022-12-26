package String;

import java.util.Arrays;

public class Anagram2 
{
public static void main(String[] args)
{
	String s1="world";
	String s2="ldwor";
	
	if(s1.length()==s2.length())
	{
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[j]>b[j+1])
				{
				  char temp1=b[j];
					b[j]=b[j+1];
					b[j+1]=temp1;
				}
			}
		}
		System.out.println(Arrays.toString(b));

		int flag=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				//System.out.println("not anagram");
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
		    System.out.println(" anagram");	
		}
		else
		{
			System.out.println(" not anagram");
		}
	}

	else
	{
		System.out.println("String have a different length");
	}
}
}
