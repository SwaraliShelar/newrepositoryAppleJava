package ClassesAndObjects;

import java.util.Scanner;

public class Fibonnacci {

	void fibo()
	{
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
	}
	public static void main(String[] args) {
    Fibonnacci fi=new Fibonnacci();
    fi.fibo();
	}

}

