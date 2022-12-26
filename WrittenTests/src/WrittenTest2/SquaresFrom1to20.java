package WrittenTest2;

import java.util.Scanner;

public class SquaresFrom1to20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		System.out.println("square from 1 to " + num + " is:");

		for (int i = 1; i <= num; i++) {
			System.out.println(i * i);
		}

	}
}
