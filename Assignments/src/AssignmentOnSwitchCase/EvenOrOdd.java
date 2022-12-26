//2.Write a Java program to check whether a number is even or odd using switch case 
package AssignmentOnSwitchCase;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your choich: ");
    int ch=sc.nextInt();
    System.out.println("Enter a number: ");
	int num=sc.nextInt();
	
	switch(ch)//this is not correct program,EvenOrOdd2 is correct program
	{
		case 1:
			if(num % 2==0) 
				System.out.println("number is even" + num);
			break;
		case 2:
			if(num % 2!=0) 
				System.out.println("number is odd" + num);
			break;
			default:
				System.out.println("Enter valid choice");
	}
	sc.close();
}
}
