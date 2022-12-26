package String;

import java.util.Arrays;

public class DisplayIndexOfullSentence 
{
public static void main(String[] args) 
{
	String s="The quick brown fox jumps over the lazy dog.";
	char c[]=s.toCharArray();
	Arrays.sort(c);
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='A' && c[i]<='Z')
		{
			int ch1=(c[i]-64);
			System.out.println(c[i]+":"+ch1);
		}
		else if(c[i]>='a' && c[i]<='z')
		{
			int ch2=(c[i]-96);
			System.out.println(c[i]+":"+ch2);
		}
	}
}
}
