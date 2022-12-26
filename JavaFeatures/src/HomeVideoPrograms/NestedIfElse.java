package HomeVideoPrograms;
import java.util.Scanner;

public class NestedIfElse {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	
	if(num>0 && num<100) 
		{
			if(num<=10) 
				System.out.println("number is less than or equal to 10");
			
			else 
			System.out.println("number is greater than or equal to 10");
		}
		    
	else {
				System.out.println("number is not valid ");
		 }
	
	sc.close();
}
}
