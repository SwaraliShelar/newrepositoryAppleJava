//6.Write a program to find sum of all even numbers between 1 to n. 
package AssignmentOnLoops;

import java.util.Scanner;

public class SumOfAllEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i, sum = 0;
		System.out.println("enter any number:");
		n = sc.nextInt();

		for (i = 2; i <= n; i++)
		{
			if (i % 2 == 0) 
			{
				sum +=i;
			}

		}
		System.out.print("sum of all even numbers between 1 to "+n+ ":"+sum);
	}
}
