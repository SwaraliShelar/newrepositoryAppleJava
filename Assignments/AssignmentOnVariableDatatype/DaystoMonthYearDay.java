//9. Write a Java program to convert days into years, weeks and days.
package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class DaystoMonthYearDay {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a days:");
	int days=sc.nextInt();//365
	
	int year=days/365;
	//days=days%365;
	System.out.println("number of year: "+year);
	
	int month=days/7;
	 //days=days%7;
	System.out.println("number of month: "+month);
	
	int day=days;
     //days=days%7;
	System.out.println("number of days: "+day);
	sc.close();
	
}
}
