//15.1!+2!+3!.........+n! find s
package AssignmentOnLoops;

import java.util.Scanner;

public class FacorialOfSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j,sum=0,fact=1;
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	for( i=1;i<=num;i++)

	for( i=1;i<=num;i++)
	{
		for(j=1;j<=i;j++)
		{
		fact=fact*j;
		sum=sum+fact;
	}}
	System.out.println("sum of facorial of "+ num +" is "+sum);
}
}
