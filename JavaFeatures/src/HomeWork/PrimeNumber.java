package HomeWork;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		System.out.println("Enter a small number:");
		i = sc.nextInt();
		System.out.println("Enter a large number:");
		j = sc.nextInt();
		// int i=1,j=50,k;
		System.out.println("Prime number from" + i + "to" + j + " \n");
		while (i < j) {
			boolean flag = false;
			for (k = 2; k <= i / 2; k++) {
				if (i % k == 0)
					flag = true;
				break;
			}
			if (!flag)

				System.out.println(i);
			i++;
		}

	}
}
