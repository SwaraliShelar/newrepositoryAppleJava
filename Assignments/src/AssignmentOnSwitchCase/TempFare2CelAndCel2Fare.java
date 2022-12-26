package AssignmentOnSwitchCase;

import java.util.Scanner;

public class TempFare2CelAndCel2Fare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your choice\n 1.farenhiet to celcius\n 2.celcius to farewnheit ");
		int temp = sc.nextInt();
		double f, c;

		switch (temp) {
		case 1:
			System.out.println("enter  farenheit temperature : ");
			c = sc.nextDouble();
			f = 9 / 5 * c + 32;
			System.out.println("farenheit to celcius: " + f);
			break;

		case 2:
			System.out.println("enter  celcius temperature : ");
			f = sc.nextDouble();
			 c= 5/9 * (f -32);
			System.out.println("celcius to farewnheit :" + c);
			break;

		default:
			System.out.println("no answer");
		}
		sc.close();

	}
}
