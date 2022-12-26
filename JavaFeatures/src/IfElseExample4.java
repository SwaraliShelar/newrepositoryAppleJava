import java.util.Scanner;

public class IfElseExample4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
		if(num%3==0)
		{
       System.out.println("number is divisible by 3");
		}
		else
		{
			System.out.println("number is not divisible by 3");
			
		}
		sc.close();

	}
	}


