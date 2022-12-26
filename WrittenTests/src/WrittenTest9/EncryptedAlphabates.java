package WrittenTest9;

import java.util.Arrays;
import java.util.Scanner;

/*3.The encryption of alphabets are to be done as follows:	[2]
A=1,B=2,C=3,Z=26
The potential of a word is found by adding the encrypted value of the alphabets.

Example: KITE
Potential = 11 + 9 + 20 + 5 = 45
Accept a sentence Decode the words according to their potential 

Output the result in format given below:
 Input:THE SKY IS THE LIMIT.

OUTPUT:THE=33,SKY=55,IS=28,THE=33,LIMIT=63 
 */
public class EncryptedAlphabates 
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
