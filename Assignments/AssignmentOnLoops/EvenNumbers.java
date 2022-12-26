package AssignmentOnLoops;

import java.util.Scanner;

public class EvenNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	int i=121;
	
	while(i<=num)
	{
		if(i%2==0)
			System.out.println(i+" ");
		i++;
	}
	System.out.println("even numbers");
	sc.close();
}
}
