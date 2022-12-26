package AssignmentNo1;
import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the values: ");
	
	float p=sc.nextFloat();
	//The principal is the amount that initially borrowed from the bank or invested.
	//The principal is denoted by P.
	
	float t=sc.nextFloat();
	//Time is the duration for which the principal amount is given to someone.
	 //Time is denoted by T.
		
	float r=sc.nextFloat();
	//Rate is the rate of interest at which the principal amount is given to someone for a certain time.
	//the rate of interest can be 5%, 10%, or 13%, etc. 
	//The rate of interest is denoted by R.
	
	
	float si=((p*t*r)/100);
	System.out.println("Simple Interest :"+si);
	
	sc.close();
}
}
