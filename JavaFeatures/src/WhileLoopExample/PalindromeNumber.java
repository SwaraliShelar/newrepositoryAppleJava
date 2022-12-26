package WhileLoopExample;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int r,rev=0,temp=num;
		
		//this is reverse number program but 
		//to check number is palindome or not 
		//we just have to initialize variable temp = num 
		// and temp==rev is must 
		
		while(num!=0)
		{
			r=num%10;//r=remainder
			rev=rev*10+r;
			num=num/10;
		}
		 if(temp==rev)//(temp==rev)is must 
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("not palindrome");
		 }
		 sc.close();
}
}
