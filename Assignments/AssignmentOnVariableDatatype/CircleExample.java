//5. Write a Java program to enter radius of a circle and find its diameter, circumference and area
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class CircleExample {
	public static void main(String[] args) {

   Scanner sc=new Scanner (System.in);
   System.out.println("Enter radius of circle :");
   float r=sc.nextFloat();
   float diameter=2*r*r;
   float circumference=2*3.14f*r;
   float area=3.14f*r*r;
		   System.out.println("\n diameter:"+diameter+ "\n circumference:"+circumference+ " \n area:"+area);
   sc.close();
	}
}
