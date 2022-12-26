import java.util.Scanner;

public class LargestSmallestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (a >= b && a >= c && a >= d) {
			System.out.println("Largest number:" + a);

		} else if (b >= a && b >= c && b >= d)

			System.out.println("Largest number :" + b);

		else if (c >= a && c >= b && c >= d)

			System.out.println("Largest number :" + c);
		else {

			System.out.println("Largest number :" + d);

		}
		if (a <= b && a <= c && a <= d) {
			System.out.println("Smallest number:" + a);

		} else if (b <= a && b <= c && b <= d)

			System.out.println("Smallest number :" + b);

		else if (c <= a && c <= b && c <= d)

			System.out.println("Smallest number :" + c);

		else {

			System.out.println("Smallest number :" + d);

		}
   sc.close();
}
}
