package String;

import java.util.Arrays;

public class RemoveOccuenceOfBCAFromString
{
public static void main(String[] args) 
{
	String s1="abbcaabcaabbcaacaacbcaacbac";
    /*By using replace method
    String s=s1.replace("bca", "");
	System.out.println(s);*/
	
	char ch[]=s1.toCharArray();
	int len=ch.length;
	String s2="";
	for(int i=0;i<len;i++)
	{
		if(i==len-1 || i==len-2)
		{
			s2=s2+ch[i];
		}
		else
		{
			if(ch[i]=='b' && ch[i+1]=='c' && ch[i+2]=='a')
			{
				i=i+2;
			}
			else
			{
				s2=s2+ch[i];
			}
		}
	}
	System.out.println(s2);
}
}