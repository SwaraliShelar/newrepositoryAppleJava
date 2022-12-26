package AssignmentOnLoops;

import java.util.Scanner;

public class GCDandLCM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 0;
		for (int i = 1; i <= a; i++)
		{
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		System.out.println("GCD value is : " + " " + gcd);
		int lcm = a * b / gcd;
		System.out.println("LCM value is : " + " " + lcm);

	}
}
