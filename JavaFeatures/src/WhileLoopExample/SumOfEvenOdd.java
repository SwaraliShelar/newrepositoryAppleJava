package WhileLoopExample;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = 1, num, sume = 0, sumo = 0;
		num = sc.nextInt();

		while (i <= num) 
		{
			if (i % 2 == 0) {              // (i % 2 == 0) even
				sume = sume + i;
				i++;
			}

			else {
				                // (i % 2 != 0)//odd
					sumo = sumo + i;
				i++;
			}

		}
		System.out.println("addition of sum of even number : " + sume);
		System.out.println("addition of sum of odd number : " + sumo);
		sc.close();
	}
}