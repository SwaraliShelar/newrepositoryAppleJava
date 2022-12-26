package WhileLoopExample;

import java.util.Scanner;

public class PrimeUsingMidValue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int mid=num/2;
	int i=2;
	
	while(i<=mid) {
	if(num%i==0)
	{
		//System.out.println("not prime");	
	break;	
	}i++;
}
	if(i>mid)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("not prime");
}
	sc.close();
}}
