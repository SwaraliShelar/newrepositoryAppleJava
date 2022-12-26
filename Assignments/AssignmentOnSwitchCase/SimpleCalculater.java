//	4. Write a Java program to create Simple Calculator using switch case Menu Driven 

package AssignmentOnSwitchCase;

import java.util.Scanner;

public class SimpleCalculater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		System.out.println("select operation:");
	    System.out.println("addition-a  substraction-s  multiplication-m  division-d");
	    int ch=sc.next().charAt(0);
	    
	    switch(ch) {
		case 'a':
		    System.out.println("Addition of two number :"+ (a+b));
		    break;
		case 's':
			System.out.println("substraction of two number : "+ (a-b));
			break;
		case 'm':
			System.out.println("multiplication of two number : "+ (a*b));
			break;
		case 'd':
			System.out.println("Division of two number : "+ (a/b));
			break;
			default:
		    System.out.println("enter valid number");
		}
	    sc.close();
	}

}
