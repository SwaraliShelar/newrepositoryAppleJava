//create the one method with int type parameter and find out the sum of factors of given parameter
package Tasks;

import java.util.Scanner;

public class SumOfFactors {
	void fact(int num)
	{
		int sum=0;
	for(int i=1;i<=num;i++)
	{
	if(num%i==0)
	{
		sum=sum+i;
	}
	}System.out.println("Sum of factors:"+sum);

	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num1=sc.nextInt();
	SumOfFactors sof=new SumOfFactors();
	sof.fact(num1);
}
}
