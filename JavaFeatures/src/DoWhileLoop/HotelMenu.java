package DoWhileLoop;

import java.util.Scanner;

public class HotelMenu {
public static void main(String[] args) {
	
	System.out.println("******  welcome in our hotel  ****** ");
	System.out.println(".....our famous menues are.....");
	System.out.println("\n1.pavbhaji \n2.vada pav \n3.panipuri \n4.bhel \n5.kachori\n");
	int se,quan;
	char ch;
	Scanner sc=new Scanner(System.in);

	do
	{
		System.out.println("select the menu:");
		se=sc.nextInt();
		switch(se) {
		case 1:
			System.out.println("pavbhaji");
			System.out.println("please enter a quantity:");
			quan=sc.nextInt();
			System.out.println("total price of pavbhaji is:"+(100*quan));
			break;
		case 2:
			System.out.println("vadapav");
			System.out.println("please enter a quantity:");
			quan=sc.nextInt();
			System.out.println("total price of vadapav is:"+(200*quan));
			break;
		case 3:
			System.out.println("panipuri");
			System.out.println("please enter a quantity:");
			quan=sc.nextInt();
			System.out.println("total price of panipuri is:"+(300*quan));
			break;
		case 4:
			System.out.println("bhel");
			System.out.println("please enter a quantity:");
			quan=sc.nextInt();
			System.out.println("total price of bhel is:"+(400*quan));
			break;
		case 5:
			System.out.println("kachori");
			System.out.println("please enter a quantity:");
			quan=sc.nextInt();
			System.out.println("total price of kachori is:"+(500*quan));
			break;
			default:
				System.out.println("please select valid menu");
		}
		System.out.println("\ndo you want to order a another menu:(y/n)\n");
		//System.out.println("<<<<<<<THANK YOU FOR VISING>>>>>>>");
		ch=sc.next().charAt(0);
	}while( ch=='y' || ch=='y');
	
	sc.close();
}
}
