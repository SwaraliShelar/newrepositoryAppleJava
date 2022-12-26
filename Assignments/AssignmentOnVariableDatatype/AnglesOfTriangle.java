//12. Write a Java program to enter two angles of a triangle and find the third angle.

package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class AnglesOfTriangle {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first and second angle:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c;
	int triangle=180;
	
	//triangle=a° + b° + c° = 180°. 
	//first angle, second angle and third angle (60+60+60)=180
	
	c=triangle-a-b;
	System.out.println("value of third angle is: "+c);
	sc.close();
}
}
