import java.util.Scanner;

public class SwitchHotel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.puran poli :200 \n2.dal bati :300 \n3.pav bhaji :400 \n4.misal :100 \n5.dam chicken:1000\n");
		System.out.println("Enter your choice : ");
		int num = sc.nextInt();
		int quantity;
		switch (num) {
		case 1:
			System.out.println("puran poli");
			System.out.println("Enter a quantity: ");
			 quantity = sc.nextInt();
			System.out.println("Total price of puran poli dish is : " +200 *quantity);

			break;

		case 2:
			System.out.println("dal bati\n");
			System.out.println("Enter a quantity: ");
			 quantity = sc.nextInt();
			System.out.println("Total price of dal bati dish is : " + 300 *quantity);

			break;

		case 3:
			System.out.println("pav bhaji\n");
			System.out.println("Enter a quantity: ");
		quantity = sc.nextInt();
			System.out.println("Total price of pav bhaji dish is " + 400 * quantity);

			break;
		case 4:
			System.out.println("misal\n");
			System.out.println("Enter a quantity: ");
			 quantity = sc.nextInt();
			System.out.println("Total price of misal dish is " + 100 *quantity);

			break;
		case 5:
			System.out.println("dam chicken\n");
			System.out.println("Enter a quantity: ");
			 quantity = sc.nextInt();
			System.out.println("Total price of dam chicken dish is : " +1000 *quantity);

			break;

		default:
			System.out.println("Enter valid choice :");
		}
		sc.close();

	}
}
