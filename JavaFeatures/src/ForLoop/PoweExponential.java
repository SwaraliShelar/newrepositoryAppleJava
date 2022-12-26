package ForLoop;

import java.util.Scanner;

public class PoweExponential {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int b,e,result=1;
	System.out.println("enter a value of base:");
	b=sc.nextInt();
	System.out.println("enter a value of exponential:");
	e=sc.nextInt();
	for(int i=1;i<=e;i++)
	{
		result=b*b;
	}System.out.println(b+"^"+e+"="+result);
}
}

