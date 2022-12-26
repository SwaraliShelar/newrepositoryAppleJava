package AssignmentNo2;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a term : ");
		int i = 2, n1 = 0;
		int n2 = 1, n3;
		int num = sc.nextInt();
		System.out.println( n1 + "\n "+n2);// printing 0 and 1
		while (i <= num) // loop starts from i=2 because 0 and 1 are already printed
		{

			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
			i++;
		}
		System.out.println("\nfibonacci series up to 20 terms.");
		sc.close();
	}
}
