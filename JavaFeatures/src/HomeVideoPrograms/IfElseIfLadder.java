package HomeVideoPrograms;
import java.util.Scanner;

public class IfElseIfLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks:");
		float m=sc.nextFloat();
		
		if(m>=0 && m<=100) 
		{
		    if(m>=91 && m<=100) 
		        System.out.println("student pass with A+ grade");
		    else if(m>=80 && m<=90)
		        System.out.println("student pass with A grade");
		    else if(m>=70 && m<=79)
			    System.out.println("student pass with B grade");
		    else if(m>=50 && m<=69)
			    System.out.println("student pass with c grade");
		    else if(m>=35 && m<=49)
			    System.out.println("student is pass");
		    else 
		    	System.out.println("Student is fail");
		}
		
		else 
		{
			System.out.println("enter a valid marks");
		}
		sc.close();
	}
	}


