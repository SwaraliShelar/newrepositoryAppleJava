//10)find which is greatest  number in between 2 numbers  using switch.
package AssignmentOnSwitchCase;

import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice:");
	int num=sc.nextInt();
	System.out.println("Enter a 2 numbers:");
	
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	
	switch(num) {
	case 1:
		if(n1>=n2)
			System.out.println( n1 + " the greatest number between two numbers ");
	break;
	case 2:
		if(n2>=n1)
			System.out.println( n2 + " the greatest number between two numbers ");
	break;
	default:
		System.out.println("Enter your valid  choice:");
	}
	sc.close();
	
}
}
