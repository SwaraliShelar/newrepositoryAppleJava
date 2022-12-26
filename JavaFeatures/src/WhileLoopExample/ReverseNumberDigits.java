package WhileLoopExample;

import java.util.Scanner;

public class ReverseNumberDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");//7654
	int rev=0,r,num;//r=remainder
	num=sc.nextInt();
	
	while(num!=0)
	{
		r=num%10;     //r=7654%10=4       r=765%10=5       r=76%10=6      r=7%10=7
		rev=rev*10+r;//rev=0*10+4=4     rev=4*10+5=45    rev=45*10+6=456  rev=456*10+7=4567
		num=num/10;//num=7654/10=765    num=765/10=76     num=76/10=7      num=7/10=0
		
	}
	System.out.println("reverse number is:"+rev);
	sc.close();
	
}
}
