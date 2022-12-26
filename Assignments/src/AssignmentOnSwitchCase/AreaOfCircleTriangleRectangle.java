//9.WAP in java using switch case for following: Area of a circle ,Area of a square ,Area of a right angled triangle, Area of a rectangle, Circumference of a circle ,Perimeter of a square Accept inputs like radius,side,etc through keyboard.
//Menu driven program using switch case:

package AssignmentOnSwitchCase;

import java.util.Scanner;

public class AreaOfCircleTriangleRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice:");
		int ch= sc.nextInt();
        
		// Area of a circle =3.14*r*r;
		// Area of a square =side*side;
		// Area of a right angled triangle=0.5*b*h;
		// Area of a rectangle =l*b;
		// Circumference of a circle =2*3.14*r
		//equilateral triangle=Math.sqrt(3)/4*side*side
		// Perimeter of a square =4*side

		switch (ch) {
		case 1:
			System.out.println("enter radius:");
			double r = sc.nextDouble();
			Double circle = 3.14 * r * r;
			System.out.println("Area of a circle =" + circle);
			break;
		case 2:
			System.out.println("enter side:");
			int s = sc.nextInt();
			int square = s * s;
			System.out.println("Area of a square=" + square);
			break;

		case 3:
			System.out.println("enter base and height:");
			int b = sc.nextInt();
			int h = sc.nextInt();
			double ratri = 0.5 * b * h;
			System.out.println("Area of a right angled triangle=" + ratri);
			break;

		case 4:
			System.out.println("enter length and breadth:");
			int b1 = sc.nextInt();
			int l = sc.nextInt();
			int rectangle = l * b1;
			System.out.println("Area of a right angled rectangle=" + rectangle);
			break;

		case 5:
			System.out.println("enter side:");
			double side = sc.nextDouble();
			double equi = Math.sqrt(3) / 4 * side * side;
			System.out.println("equilateral triangle =" + equi);
			break;
		case 6:
			System.out.println("enter radius:");
			double r1 = sc.nextDouble();
			double ccircle =2*3.14*r1;
			System.out.println("Circumference of a circle =" + ccircle);
			break;
		case 7:
			System.out.println("enter side:");
			double side1 = sc.nextDouble();
			double perisqur = 4 * side1;
			System.out.println("Perimeter of a square =" + perisqur);
			break;
		default:
			System.out.println("enter right choice");
		}
		sc.close();

	}
}
