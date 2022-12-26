//10. Write a Java program to find power of any number x ^ y.

package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class PowerOfExponant {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//r=result
	//b=base
	//e=exponent
	
	
	System.out.println("enter base and exponent : ");
	int b=sc.nextInt();
	int e=sc.nextInt();
	
	int r=(int)Math.pow(b,e);
	System.out.println("r=" + b +"^"+ e+"="+r);
	sc.close();
}
}
