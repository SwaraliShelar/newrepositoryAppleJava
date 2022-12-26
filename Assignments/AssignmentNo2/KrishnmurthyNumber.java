//8. WAP to check no is Krishnamurthy or not (Using while loop)
//i.e. 153 = 1! + 5! + 3! = 153

package AssignmentNo2;

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
