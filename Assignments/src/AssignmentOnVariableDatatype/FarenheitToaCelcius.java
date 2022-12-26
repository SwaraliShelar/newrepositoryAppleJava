//8. Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class FarenheitToaCelcius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temprature in  farenheit: ");
     	
		double f, c;
		
		   //f=9/5*(c+32);
           //c=5/9*(f-32)
		
		f = sc.nextDouble();
		c = 5 / 9 * (f-  32);
		System.out.println("Temprature in  celcius to farenheit :" + c);
		sc.close();

	}
}
