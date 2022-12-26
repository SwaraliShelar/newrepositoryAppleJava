//14.WAP to accept base and index from user and calculates power
package AssignmentOnLoops;

import java.util.Scanner;

public class IndexPower {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a base :");
		int base = sc.nextInt();
		System.out.println("enter a index :");
		int index = sc.nextInt();

		int power = (int) Math.pow(base, index);
		System.out.println("power of " + base + "^" + index + " is " + power);
	}
}
