import java.util.Arrays;
//anagram :- length and number of character should be same
public class Anagram 
{
public static void main(String[] args)
{
	String s1="maharashtra";
	String s2="ahamartrash";
	if(s1.length()==s2.length())
	{
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int flag =1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i]) 
			{
				System.out.println("not anagram");
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("anagram");
		}
	}
	else
	{
		System.out.println("not anagram");
	}
}
}