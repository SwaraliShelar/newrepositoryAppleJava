package ForLoop;

import java.util.Scanner;

public class TableOfNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	
	int num=sc.nextInt();
	
	for(int i=1;i<=num;i++) {
		System.out.println(num*i);
	}
}
}
