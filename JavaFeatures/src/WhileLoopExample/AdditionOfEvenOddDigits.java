package WhileLoopExample;

import java.util.Scanner;

public class AdditionOfEvenOddDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int num=sc.nextInt();
	int r,sume=0,sumo=0;
	while(num!=0)
	{
		r=num%10;
		if(num%2==0) {
			sume=sume+r;
		}
		else {
			sumo=sumo+r;
		}
		num=num/10;
	}
	System.out.println("addition of even number is:"+sume);
	System.out.println("addition of odd number is:"+sumo);
	sc.close();
}
}
