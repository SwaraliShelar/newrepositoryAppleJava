//2. Write a java program to find sum of digits in any number.
package AssignmentNo2;

import java.util.Scanner;

public class DigitNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int sum = 0, r, num;
		num = sc.nextInt();

		while (num != 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println(sum);

		sc.close();
	}
}
