package ForLoop;

import java.util.Scanner;

public class BaseAndIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=1,base,exponent;
		System.out.println("Enter a base:");
		 base= sc.nextInt();
	
		System.out.println("Enter a exponent:");
		exponent= sc.nextInt();
		while (exponent != 0) {
		     result *= base;
		      --exponent;
		    }

		    System.out.println("Answer = " + result);
		sc.close();
}}
