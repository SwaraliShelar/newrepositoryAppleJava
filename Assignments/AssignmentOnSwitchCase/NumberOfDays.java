//5.Write a program that displays the day of the week corresponding to the number entered. i.e., 1 - "Monday", 2- "Tuesday" and so on.
package AssignmentOnSwitchCase;

import java.util.Scanner;

public class NumberOfDays {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number:");
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:
		System.out.println("1-monday");
		break;
	case 2:
		System.out.println("2-tuesday");
		break;
	case 3:
		System.out.println("3-wednesday");
		break;
	case 4:
		System.out.println("4-thursday");
		break;
	case 5:
		System.out.println("5-friday");
		break;
	case 6:
		System.out.println("6-saturday");	
		break;
	case 7:
		System.out.println("7-sunday");
		break;
		default:
			System.out.println("Output is not available");
	}
	sc.close();
}
}
