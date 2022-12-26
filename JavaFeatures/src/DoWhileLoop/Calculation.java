package DoWhileLoop;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		int a, b;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition \n2.substraction\n3.multiplication\n4.division\n");
	
		
		do {
			System.out.println("enter your choice:");
			int ch1 = sc.nextInt();
			switch (ch1) 
			{
			case 1:
				System.out.println("Enter two numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("addition of two numbers:" + (a + b));
				break;

			case 2:
				System.out.println("Enter two numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("substraction of two number:" + (a - b));
				break;

			case 3:
				System.out.println("Enter two numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("multiplication of two numbers:" + (a * b));
				break;

			case 4:
				System.out.println("Enter two numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("division of two numbers:" + (a / b));
				break;
            default:
	            System.out.println("enter valid number");
			}

			 System.out.println("do you want to continue:??(y/n)");
			 ch=sc.next().charAt(0);
		}
		while (ch == 'Y' || ch == 'y');
		sc.close();

	}


}
