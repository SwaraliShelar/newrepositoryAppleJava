//11. Write a Java program to enter any number and calculate its square root.

package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter a value :");
	int x=sc.nextInt();
	
	double r=(double)Math.sqrt(x);
	System.out.println("Square root of "+ x + " is "+r);
	sc.close();
	
}
}
