//13. Write a Java program to enter base and height of a triangle and find its area.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class TriangleArea {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float b,h;
	System.out.println("enter base and height of triangle: ");
	 b =sc.nextFloat();
	 h =sc.nextFloat();
	 float area=0.5f * b* h;
	 System.out.println("area of triangle is : "+area);
	 sc.close();
}
}
