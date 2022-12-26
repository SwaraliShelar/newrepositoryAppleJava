//7. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class CelciousToFahrenheit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a temp in celcious : ");
	
	
	double c=sc.nextDouble();
	
	         //f=9/5*(c+32);
            //c=5/9*(f-32);
	
	 double f=9/5*(c+32);
        
	 System.out.println("given teperature fahrenhiet to celcious:"+f);
	sc.close();
}
}
