package WhileLoopExample;

import java.util.Scanner;

public class AdditionOfDigitsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int r,sum=0;
		int num=sc.nextInt();
		while(num!=0)//num=345 
		{
			r=num%10;//r=345%10=5         r=34%10=4      r=3%10=3
			sum=sum+r;//sum=0+5=5         sum=5+4=9    sum=9+3=12
			num=num/10;//num=345/10=34   num=34/10=3   num=3/10=0	
		}	
		System.out.println("Addition is :"+sum);
		sc.close();
}
}
