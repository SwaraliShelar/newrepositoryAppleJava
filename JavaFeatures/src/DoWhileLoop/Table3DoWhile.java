package DoWhileLoop;

import java.util.Scanner;

public class Table3DoWhile {
public static void main(String[] args) {
	int i=1,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
    n=sc.nextInt();
	System.out.println("table of "+n);
	do
	{
			System.out.println(n*i);
			i++;
		
	}while(i<=10);
}
}
