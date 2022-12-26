package WhileLoopExample;

import java.util.Scanner;

public class EvenExmaple2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int i = 1, num;
		num = sc.nextInt();
		System.out.println("number is even");
		while (i <= num) {
			if (i % 2 == 0)
				System.out.println(i + " ");
			i++;
     sc.close();
		}
	}
}
