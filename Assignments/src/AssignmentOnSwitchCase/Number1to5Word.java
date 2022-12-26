//7. Write a Java program to enter number between 1to 5 and print it in word
package AssignmentOnSwitchCase;

import java.util.Scanner;

public class Number1to5Word {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	switch(num)
	{
	case 1:System.out.println("one");break;
	case 2:System.out.println("two");break;
	case 3:System.out.println("three");break;
	case 4:System.out.println("four");break;
	case 5:System.out.println("five");break;
	
		default:
			System.out.println("error,enter valid number");
	}
	sc.close();
}
}
