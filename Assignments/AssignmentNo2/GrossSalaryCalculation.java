package AssignmentNo2;
import java.util.Scanner;

public class GrossSalaryCalculation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the employee a basic salary : ");
	double gross,da,hra;
	double ba=sc.nextDouble();
	
	if(ba <= 10000) {
	   
	      da=ba*0.8;
		 hra=ba*0.2;
		
	}
	else if(ba <= 20000) {
		 da=ba*0.9;
		 hra=ba*0.25;
		 
	}
	else {
		  da=ba*0.95;
	     hra=ba*0.3;  
	 
	}
	
  gross= ba+  da + hra;
  System.out.println(" basic salry of employee :"+gross);
sc.close();
}
}

