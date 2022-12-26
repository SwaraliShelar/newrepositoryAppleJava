package AssignmentOnLoops;

import java.util.Scanner;
public class OddNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int i=521;
	
	 
	while(i>=num)
	{
		if(i%2!=0) {
			System.out.println(i+" " );
			i=i-2;
		}
	}
	System.out.println("odd numbers");
	sc.close();
}
}
	
	