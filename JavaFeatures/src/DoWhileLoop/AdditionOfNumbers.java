package DoWhileLoop;

import java.util.Scanner;

public class AdditionOfNumbers {
public static void main(String[] args) {
	
	int a,b;
	char ch;
	Scanner sc=new Scanner(System.in);	
	do
	{
		System.out.println("enter two numbers:");
		 a=sc.nextInt();
		 b=sc.nextInt();	
		System.out.println("addition of two numbers:"+(a+b));
		System.out.println("you want to contionue:(y/n)??");
		ch=sc.next().charAt(0);
	}while( ch =='y' || ch =='Y');
}
}
