package Tasks;

import java.util.Scanner;

public class Xobinfibbo {
public static void main(String[] args) {
	int a=0,b=1;
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
	}

	
}
}
