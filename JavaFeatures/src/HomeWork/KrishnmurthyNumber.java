package HomeWork;

import java.util.Scanner;

public class KrishnmurthyNumber {
public static void main(String[] args) {
	int num,sum=0,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextInt();
	int temp=num;
	
	while(temp!=0)
	{
		r=temp%10;
		int fact=1;
		for(int i=1;i<=r;i++) 
			//dont give a bracket otherwise error occure
			fact=fact*i;
			sum=sum+fact;
		
		temp=temp/10;	
	
	}
	 if ( sum ==num)
         System.out.println ("yes");
    else
         System.out.println ("no");
	
}
}
