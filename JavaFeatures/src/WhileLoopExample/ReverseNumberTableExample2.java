package WhileLoopExample;

import java.util.Scanner;

public class ReverseNumberTableExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();


		while (num>0) {
			System.out.println(num + " ");
			num--;
		}
		
		System.out.println("This is all Reverse Number");
	
	}
}