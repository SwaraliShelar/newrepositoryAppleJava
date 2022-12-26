package AssignmentNo2;
import java.util.Scanner;

public class CalculaterSwitchExample {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		int a,b;
			
			System.out.println("1.addition \n2.substraction \n3.multiplication \n4.division");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter a two numbers: ");
                a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("addition of a and b is "+(a+b));
				break;
			case 2:
				System.out.println("Enter a two numbers: ");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("substraction of a and b is "+(a-b));
				break;
			case 3:
				System.out.println("Enter a two numbers: ");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("multiplication of a and b is "+(a*b));
				break;
			case 4:
				System.out.println("Enter a two numbers: ");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("division of a and b is "+(a/b));
				break;
			}
			sc.close();
	 }
}

			

