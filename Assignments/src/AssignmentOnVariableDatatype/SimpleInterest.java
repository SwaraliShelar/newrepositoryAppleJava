//16. Write a Java program to enter P, T, R and calculate Simple Interest.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter values of p, t and r :");
	double si,p,t,r;
	p=sc.nextDouble();
	t=sc.nextDouble();
	r=sc.nextDouble();

	
	si=(p*t*r)/100;
	System.out.println("simple interest:"+si);
	sc.close();
}
}
