//2 .Write a Java program to enter two numbers and perform all arithmetic operations.

package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class ArithmaticOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int addition = n1 + n2;
		int substraction = n1 - n2;
		int division = n1 / n2;
		int multiplication = n1 * n2;
		System.out.println("\n addition :" + addition + " \n substraction :" + substraction + "\n division:" + division
				+ "\n multiplication:" + multiplication);
		sc.close();
	}
}
