package WhileLoopExample;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num=sc.nextInt();
	int r,sum=0,temp=num;
	
	//Armstrong number :-  153,370,371,407
	while(num!=0) {
		r=num%10;
		sum=sum+r*r*r;//if there is three digit number then we can multiply (r*r*r)
		num=num/10;   //if there is four digit number then we can multiply (r*r*r*r)
	}
		if(temp==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}
		sc.close();	
}
}
