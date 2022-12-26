package AssignmentOnLoops;

import java.util.Scanner;

public class PalindromFrom100to500 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first limit:");
	int num1=sc.nextInt();
	System.out.println("Enter a last limit:");
	int num2=sc.nextInt();
	System.out.println("Palindrom number from "+ num1 +" to "+ num2 +":");
	for(int i=num1;i<=num2;i++)
	{

		int num=i;
	  int temp=num,r,rev=0;

	while(num!=0) 
	{
		r=num%10;
		rev=rev*10+r;
		num=num/10;
	}
	if(temp==rev)
		System.out.print(rev+" ");
	}
}
}
