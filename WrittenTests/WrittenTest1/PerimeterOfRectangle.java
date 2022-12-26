package WrittenTest1;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {

		float length, breadth, area, perimeter;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter length  of rectangle: ");
		length = sc.nextFloat();

		System.out.println("Enter breadth of rectangle: ");
		breadth = sc.nextFloat();

		area = length * breadth;
		perimeter = 2 * (length + breadth);
		
		// sides of rectangle are 4 a,b,c,d
		// a=c b=d
		//Perimeter Of Rectangle= a+ b+ c+ d= a+ b+ a+ b= 2*(a + b).
		   
		System.out.println("Area of rectangle: " + area);
		System.out.println("perimeter of rectangle: " + perimeter);
		sc.close();
	}
}
