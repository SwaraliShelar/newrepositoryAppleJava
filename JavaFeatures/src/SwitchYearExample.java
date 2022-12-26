import java.util.Scanner;

public class SwitchYearExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter a month :");
		int month;
		month = sc.nextInt();
		int year = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("31 days in month");
			break;

		case 2:

			if (year / 4 == 0) {
				System.out.println("This year is leap year");
				System.out.println(" 28 days in month");
			} else {
				System.out.println("This year is not leap year");
				System.out.println(" 29 days in month");
			}

			break;

		case 4:
		case 6:
		case 8:
		case 10:
		case 12:

			System.out.println("30 days in month");
			break;
		default:
			System.out.println("Enter a valid year number");

		}
		sc.close();

}
}
