//14. Write a Java program to calculate area of an equilateral triangle.

package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class EquilateralTriangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter sides of equilateral triangle");
	double side,equi_tri;
	side=-sc.nextDouble();
	equi_tri=Math.sqrt(3)/4*side*side;
	System.out.println("Area of equilateral triangle: "+equi_tri);
	
	sc.close();
}
}
