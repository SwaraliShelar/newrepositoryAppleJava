//13.WAP to print squares from 1 to20
package AssignmentOnLoops;

import java.util.Scanner;

public class SquareaofNumber {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	System.out.println("square from 1 to "+num);
	for(int i=1;i<=num;i++)
	{
	System.out.println(i*i);	
	}
	sc.close();
}
}
