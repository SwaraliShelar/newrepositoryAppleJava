//find the sum of digits of numbers.
package ProgramsPractice;

import java.util.Scanner;

public class SumDigit {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a digits:");
	int num=sc.nextInt();
	int sum=0;
	
	while(num>0)
	{ 
		//finds the last digit of the given number    
		int digit=num%10;
		//adds last digit to the variable sum  
		sum=sum+digit;
		//removes the last digit from the number  
		num=num/10;
	}
	System.out.println("sum of digit is:"+sum);
}
}
