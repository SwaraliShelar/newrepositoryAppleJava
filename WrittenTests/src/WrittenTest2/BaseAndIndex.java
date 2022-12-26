package WrittenTest2;

import java.util.Scanner;

public class BaseAndIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base:");
		int base= sc.nextInt();
		
		System.out.println("Enter a exponent:");
		int exponent= sc.nextInt();
		
		int result =(int)Math.pow(base,exponent);
		System.out.println(result);
		sc.close();
}}
