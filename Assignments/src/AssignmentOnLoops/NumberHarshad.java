/*19.	WAP to find given number is Harshad/Niven number or not
    An harshad number is an integer number divisible by sum of its digit 
   Eg 18 sum=9  and 18 is divisible by 9*/


package AssignmentOnLoops;

import java.util.Scanner;

public class NumberHarshad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, num, r, temp;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		temp = num;
		while (num != 0) 
		{
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		if (temp % sum == 0)
			System.out.println("harshad number");
		
		else
			System.out.println("not harshad number");

		

	}
}
