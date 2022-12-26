//2.	 WAP to print odd numbers from 521 to 229 using for loop. 
package ForLoop;

import java.util.Scanner;

public class oddNumbes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	
	for(int i=521;i>=n;i--)
	{
		if(i%2!=0)
			System.out.println(i);
	}
	System.out.println("odd numbers");
	
}
}
