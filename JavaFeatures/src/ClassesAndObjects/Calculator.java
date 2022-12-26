package ClassesAndObjects;

import java.util.Scanner;

public class Calculator {
	void addition() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addittion of " + a + " and " + b + "=" + (a + b));
	}

	void substraction() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("substraction of " + a + " and " + b + "=" + (a - b));
	}

	void multiplication() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("multiplication of " + a + " and " + b + "=" + (a * b));
	}

	void division() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("division of " + a + " and " + b + "=" + (a / b));
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.addition();
		c1.substraction();
		c1.multiplication();
		c1.division();
	}
}
