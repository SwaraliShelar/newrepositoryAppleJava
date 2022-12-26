//find a factors of given number
package Tasks;

import java.util.Scanner;

public class FactorsXobin {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	
	/*
	 int i=1;
	 while(i<=num)
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
		i++;
	}*/
	int i=1;
	do
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
		i++;
	}while(i<=num);
	
	/*for(int i=1;i<=num;i++)
	{
		if(num%i==0)
			System.out.print(i+" ");
	}*/
	
}
}
