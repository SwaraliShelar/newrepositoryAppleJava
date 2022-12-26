//4. Write a Java program to enter length and breadth of a rectangle and find its area
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class AreaOfReactangle {
	public static void main(String[] args) {
		float l,b;
		System.out.println("enter length and breadth : ");
		Scanner sc=new Scanner(System.in);
		l=sc.nextFloat();
		b=sc.nextFloat();
		float area= l*b;
		System.out.println("area of rectangle :"+area);
		sc.close();
}
}
