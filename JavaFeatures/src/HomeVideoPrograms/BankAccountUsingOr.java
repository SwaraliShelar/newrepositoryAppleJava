package HomeVideoPrograms;

import java.util.Scanner;//wrong program output is wrong

public class BankAccountUsingOr {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a bank details of person");
	System.out.println("Enter a age");
	int age=sc.nextInt();
	System.out.println("Enter a city");
	char ctz=sc.next().charAt(0);
	if(age<=18 || ctz=='p')
		System.out.println("person can create a account");
	
	else if(age<=10 || ctz=='s')
		System.out.println("please enter valid age");
	
	else if(age<=25 || ctz=='c')
		System.out.println("please enter valid city");
	
	else 
		System.out.println("please enter valid age and city");
	
	
}
}
