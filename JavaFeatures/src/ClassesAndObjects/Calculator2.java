package ClassesAndObjects;

import java.util.Scanner;

public class Calculator2 {
	void addition(int a, int b) {
		System.out.println("Addition is:" + (a + b));
	}

	void substraction(int c, int d) {
		System.out.println("Substraction is:" + (c - d));

	}

	void multiplication(int e, int f) {
		System.out.println("multiplication is:" + (e * f));
	}

	void division(int g, int h) {
		System.out.println("division is:" + (g / h));
	}

	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers:");
		i = sc.nextInt();
		j = sc.nextInt();
		Calculator2 cal = new Calculator2();
		cal.addition(i, j);
		cal.substraction(i, j);
		cal.multiplication(i, j);
		cal.division(i, j);

	}
}
