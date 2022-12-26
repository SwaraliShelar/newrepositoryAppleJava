package HomeVideoPrograms;

import java.util.Scanner;

public class EvenNumber1to20ByUsingWhileLoop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	 int n=sc.nextInt();
	 int i=1;
	 
	 while(i<=n)
	 {
		 if(i%2!=0)
		 {
			 System.out.println(i+" ");
		 }i++;
	 }System.out.println("odd numbers");
}
}
