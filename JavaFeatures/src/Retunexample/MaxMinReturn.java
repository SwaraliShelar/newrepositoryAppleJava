package Retunexample;

import java.util.Scanner;

public class MaxMinReturn {
	int x,y;
	int test(int x,int y)
	{
		if(x>y)
		{
		return x;
	    }
		else
		{
		return y;
		}
   }
public static void main(String[] args) {
	MaxMinReturn mr1=new MaxMinReturn();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter to numbers:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	mr1.test(x, y);	
	int result=mr1.test(x, y);	
	System.out.println("the greatest number x and y is:"+(result));
}
}
