package WhileLoopExample;

import java.util.Scanner;

public class TableFromInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int i=1,n,limit=10;
	n=sc.nextInt();
	while(i<=limit)
	{
	//System.out.println(n+"*"+i+":"+n*i);
		System.out.println(+n*i);
	i++;
	}
	sc.close();
	
}
}
