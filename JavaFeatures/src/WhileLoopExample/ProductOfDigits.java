package WhileLoopExample;

import java.util.Scanner;
public class ProductOfDigits {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number : ");
	int r,cnt=0,product=1;
	int num=sc.nextInt();//1234
 
	while(num!=0)
	{
		r=num%10;
		product=product*r;
		//cnt++;//it is used to count digit or number=1234 then cnt=4
		num=num/10;
	}
	System.out.println("product is :"+product);
	//System.out.println("count is :"+cnt);
	sc.close();
	}
}
