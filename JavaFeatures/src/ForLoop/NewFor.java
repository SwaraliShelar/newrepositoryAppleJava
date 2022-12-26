package ForLoop;

import java.util.Scanner;

public class NewFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
	    int n=sc.nextInt();
	
	    for(int i=1,j=n;i<=n && j<=n;i++,j--)
	    {
	    	
	    	System.out.println(i+" "+j);
	    }
	    System.out.println("done");
	}
}
