package WrittenTest2;

import java.util.Scanner;

public class ProductAnDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int r, product = 1, num;
		num = sc.nextInt();

		while (num != 0) {
			r = num % 10;
			product = product * r;
			num = num / 10;

		}
		System.out.println("Product of number:" + product);
	}
}
