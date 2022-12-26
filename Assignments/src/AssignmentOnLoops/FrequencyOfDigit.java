//10.Write a program to find frequency of each digit in a given integer.
package AssignmentOnLoops;

import java.util.Scanner;

public class FrequencyOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num, digit, temp;
		System.out.println("Enter a digits from 1 to 9:");
		num = sc.nextLong();
		System.out.println("digit\tfrequency");

		for (int i = 1; i <= 9; i++) {
			int cnt = 0;
			temp = num;
			while (temp != 0) 
			{
				digit = temp % 10;
				if (digit == i) 
				{
					cnt++;
				}
				temp = temp / 10;
			}
			if (cnt >= 0) 
			{
				System.out.println(i + "\t" + cnt);
			}
		}
		sc.close();

	}
}
	