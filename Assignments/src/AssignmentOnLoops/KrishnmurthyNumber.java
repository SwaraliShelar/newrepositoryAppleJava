//16.WAP to check given no is Krishnamurthy or not eg)  153=1!+5!+3!=153

package AssignmentOnLoops;

import java.util.Scanner;

public class KrishnmurthyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,temp,sum=0,i,r;
	System.out.println("Enter a number:");
	num=sc.nextInt();
	temp=num;
	
	while(temp!=0)
	{
		r=temp%10;
		int fact=1;
		for(i=1;i<=r;i++)
		
		fact=fact*i;
		sum=sum+fact;
		
		temp=temp/10;
		
		
	}
	if(sum==num)
		System.out.println("krishnmurthy number");
	else
	System.out.println("Not krishnmurthy number");

}
}
