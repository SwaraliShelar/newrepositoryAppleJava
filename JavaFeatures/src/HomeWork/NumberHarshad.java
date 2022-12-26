package HomeWork;

import java.util.Scanner;

public class NumberHarshad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, num, r, temp;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		temp = num;
		while (num != 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		if (temp % sum == 0)

		{
			System.out.println("harshad number");
		} else {
			System.out.println("not harshad number");

		}

	}
}
