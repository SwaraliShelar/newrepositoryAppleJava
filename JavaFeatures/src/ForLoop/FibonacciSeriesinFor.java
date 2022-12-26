package ForLoop;

import java.util.Scanner;

public class FibonacciSeriesinFor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=0,n2=1,n3;
	System.out.println("enter a number:");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		n3=n1+n2;
		System.out.print(n1+" ");// do not print n2 and n3 otherwise output is print from 1
		n1=n2;
		n2=n3;
	}System.out.println("fibonnaci series");
			
}
}
