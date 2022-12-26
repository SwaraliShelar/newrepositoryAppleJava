package WrittenTest1;

import java.util.Scanner;

public class DaysConverter {
	public static void main(String[] args) {
		
	
	int days, years, weeks;
    Scanner op=new Scanner(System.in);
    /* Input total number of days from user */
    System.out.print("Enter days: ");
    days=op.nextInt();

    /* Conversion */
    years = (days / 365);   // Ignoring leap year
    weeks = (days % 365) / 7;
    days  = days - ((years * 365) + (weeks * 7));

    /* Print all resultant values */
    System.out.println("YEARS: "+years);
    System.out.println("WEEKS: "+weeks);
    System.out.println("DAYS:  "+days);
}
}