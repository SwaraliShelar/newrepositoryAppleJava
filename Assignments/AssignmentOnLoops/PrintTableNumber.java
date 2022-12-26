//12.WAP to print table of given no
package AssignmentOnLoops;

import java.util.Scanner;

public class PrintTableNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,num;
	System.out.println("Enter a number:");
	 num=sc.nextInt();
		System.out.println("table of "+num);

	for(i=1;i<=10;i++)
	{
		System.out.println(num*i);
	}
}
}
