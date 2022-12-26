package HomeVideoPrograms;
import java.util.Scanner;

public class IfElseNested3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();
	
		
		if(age<=100)
		{
			if(age>18) 
				System.out.println("create a account");
			
			else 
				System.out.println("not create  a account");
			
		}
		else 
		{
				System.out.println("invalid age");
		}
		sc.close();
	}
	



}


