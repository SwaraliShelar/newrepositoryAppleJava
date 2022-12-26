//1. Write a Java program to enter two numbers and find their sum.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class TwoNumberSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers : ");
	float f1=sc.nextFloat();
	float f2=sc.nextFloat();
	float addition=f1+f2;
	System.out.println("addition of two numbers is : "+addition);
	sc.close();
}
}
