package WhileLoopExample;

import java.util.Scanner;

public class TableOfANumber {
public static void main(String[] args) {
	int i=1,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	n=sc.nextInt();
	
	while(i<=10)
	{
	
		System.out.println(n*i);
		i++;
	}
	System.out.println("table of "+n);
}
}
