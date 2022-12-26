package WrittenTest2;

import java.util.Scanner;

public class FrequencyOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt, i = 1;
		long temp, digit;
		System.out.println("Enter a number:");
		long num = sc.nextLong();
		System.out.println("Digit\tFrequency");

		for (i = 1; i <= 9; i++)

		{
			cnt = 0;
			temp = num;
			while (temp > 0) {
				digit = temp % 10;
				if (digit == i) {
					cnt++;
				}
				temp = temp / 10;
			}
			if (cnt > 0) {
				System.out.println(i + "\t " + cnt);
			}

		}
		sc.close();
	}
}
