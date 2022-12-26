// 1.	 WAP to print even numbers from 121 to 229 using for loop. 
package AssignmentOnLoops;

import java.util.Scanner;

public class EvenNumber2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	for(int i=121;i<=n;i++)
	{
		if(i%2==0)
			System.out.println(i);
	}
	System.out.println("all above are even numbers");
}
}
