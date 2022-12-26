package HomeVideoPrograms;
import java.util.Scanner;

public class NestedIfElse2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a year");
		int year=sc.nextInt();
		
		if(year<=2022 && year>=1950)
		{
			if(year%4==0) 
				System.out.println("leap year");
			
			else 
				System.out.println("not leap year");
			
		}
		else 
		{
				System.out.println("invalid year");
		}
		sc.close();
	}
	}


