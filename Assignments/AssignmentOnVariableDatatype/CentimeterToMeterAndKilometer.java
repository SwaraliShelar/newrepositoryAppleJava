//6. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class CentimeterToMeterAndKilometer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a legth in centimeter:");
		double cm = sc.nextDouble();
		
		// 1 meter=100 centimeter            m=cm/100 
		//1 kilometer=1000 meter             km=m/1000
		// 1kilometer=100000 centimeter     km=cm/100000

		 double meter = cm / 100;
		System.out.println("centimeter to meter :" + meter);
		 double km = cm / 100000;
		System.out.println("centimeter to kilometer :" + km);
		 km = meter/1000;
		System.out.println("meter to kilometer :" + km);
		sc.close();
	}
}
