package String;

import java.util.Arrays;

public class DisplayKite 
{
public static void main(String[] args) 
{
	String s="kite";         //world
	char ch[]=s.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
		if(ch[i]>='A' && ch[i]<='Z')
		{
			sum=sum+(ch[i]-64);		//A=1  Ascii value of A=65  b=66
		}
	}
	System.out.println(sum);
}
}
/* String s1="KITE";//"KITE"
char ch[]=s1.toCharArray();
System.out.println(Arrays.toString(ch));
int sum=0;
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>64)
	{
		sum=sum+(ch[i]-64);
	}		
}
System.out.print("sum:"+sum);
*/


/* 
Scanner sc=new Scanner(System.in);
System.out.println("enter a String:");
String s1=sc.next();//KITE
char ch[]=s1.toCharArray();
System.out.println(Arrays.toString(ch));
int sum=0;

for(int i=0;i<ch.length;i++)
{
	int a=ch[i]-64;
	sum=sum+a;
	System.out.println(ch[i]+":"+a+" ");
}
System.out.println("sum:"+sum);
}
}
*/
/*public class EncryptedAlphabates 
{
public static void main(String[] args) 
{
String s1="THE SKY IS THE LIMIT";
String s2[]=s1.split(" ");
System.out.println(Arrays.toString(s2));

for(int i=0;i<s2.length;i++)
{
	int sum=0;
	char ch[]=s2[i].toCharArray();
	for(int j=0;j<ch.length;j++)
	{
		int a=ch[j]-64;
		sum=sum+a;
	}
	System.out.println(s2[i]+":"+sum+" ");
}
}
}*/