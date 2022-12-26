import java.util.Scanner;

public class OccurenceOfCharacterinString
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int cnt=0;
	System.out.println("enter a string:");//satara
	String str=sc.next();
	char ch[]=str.toCharArray();
	System.out.println("enter the character for searching:");//a
	char c=sc.next().charAt(0);
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==c)
		{
			cnt++;
			System.out.println(c +"  is at "+i+" position");
		}
	}
	System.out.println(c +" is occured "+cnt +" times in String");
}
}
