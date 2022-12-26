package String;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeOrNot
{
public static void main(String[] args)
{
	
/*	
 //reverse by split
    String s="madam";
	String st[]=s.split("");
	System.out.print(Arrays.toString(st));
	
	
		for(int j=st.length-1;j>=0;j--)
		{
			System.out.print(s.charAt(j));
		}
	
	//convert String to array and then reverse
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));


			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
	*/
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string to check it is palindrome or not:");
	String str=sc.next();//String str="madam";
	
	String rev ="";
	for(int i=str.length()-1;i>=0;i--)
		rev=rev+str.charAt(i);
	
	if(str==rev)
	System.out.println(rev+"  is palindrom");

   else
	System.out.println(rev+"  is  not palindrom");
	
	/*	if(str.equalsIgnoreCase(rev))
		System.out.println(rev+"  is palindrom");
	
	else
		System.out.println(rev+"  is  not palindrom");*/

}
}


