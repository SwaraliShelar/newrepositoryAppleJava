//17.	WAP to check given no is palindrome or not. Original =Reverse Eg 1221

package AssignmentOnLoops;

import java.util.Scanner;

public class OriginalReversePalindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,r,rev=0,temp;
	System.out.println("Enter a number:");
	num=sc.nextInt();
	temp=num;
	
	while(num!=0)
	{
		r=num%10;
		rev=rev*10+r;
		num=num/10;
	}
	if(temp==rev)
		System.out.println("palindrom");
	else
		System.out.println("not palindrom");

}

}
