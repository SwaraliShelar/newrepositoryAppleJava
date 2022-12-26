//7. Write a program to find sum of all odd numbers between 1 to n.
package AssignmentOnLoops;

import java.util.Scanner;

public class SumOfAllOddNumbrs {
public static void main(String[] args) {
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number:");
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		
		if(i%2==1)       //if(i%2!=0)
		{
			sum+=i;
		}
	}System.out.println("sum of all odd numbers between 1 to "+n+":"+sum);
}
}
