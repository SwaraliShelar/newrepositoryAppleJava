/*3.Design a class to overload a function compare( ) as follows:
(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
(b) void compare (char,char) – to compare the numeric value of two characters and print the character with higher numeric value
 */
package WrittenTest6;

import java.util.Scanner;

public class CompareANumbers {
public void compare(int a,int b)
{
	if(a>b)
	{
		System.out.println(a+" is greaer than "+b);
	}
	else
	{
		System.out.println(b+" is greaer than "+a);
	}
}
public void compare(char a,char b)
{
	int x=(int)a;
	int y=(int)b;
	if(a>b)
	{
		System.out.println(a+" is higher numeric value than "+b);
	}
	else
	{
		System.out.println(b+" is higher numeric value than "+a);
	}
}

public static void main(String[] args) {
	CompareANumbers cn=new CompareANumbers();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a first integer value:");
	int n1=sc.nextInt();
	System.out.println("enter a second integer value:");
	int n2=sc.nextInt();
	cn.compare(n1, n2);
	System.out.println("enter a first character value:");
	char m1=sc.next().charAt(0);
	System.out.println("enter a second character value:");
	char m2=sc.next().charAt(0);
	sc.nextLine();
	cn.compare(m1,m2);
}
}
