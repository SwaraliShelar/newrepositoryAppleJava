//17. Write a Java program to enter P, T, R and calculate Compound Interest.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double ci,p,t,r;
		System.out.println("enter values of principle:");//amount
		p=sc.nextDouble();
		System.out.println("enter values of rate of interest:");//%4,%6
		r=sc.nextDouble();
		System.out.println("enter values of time period:");//1 year,2 year
		t=sc.nextDouble();

		
		ci=p*Math.pow((1+r/100),t);
		System.out.println("compound interest:"+ci);
		sc.close();
	}
}
