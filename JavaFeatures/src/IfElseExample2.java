import java.util.Scanner;

public class IfElseExample2 {
	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	System.out.println("Enter age: ");
	int age = sc.nextInt();
	
	if(age>=18 && age<=100)
	{
		if(age >=43) 
		System.out.println("allow customer to open a account");
		
		else
		System.out.println("dont allow customer to open a account");	
	}
    else
	{
		System.out.println("Entered value is invalid");
	  }
	sc.close();
    }
   }

