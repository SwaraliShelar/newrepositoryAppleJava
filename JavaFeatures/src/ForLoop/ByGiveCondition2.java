package ForLoop;

import java.util.Scanner;

public class ByGiveCondition2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
			for(int i=1,j=n;i<=n && j>=0;i++,j--)//we can give multiple initialization and multiple increaments(
			{                                    //and we can give multiple condition by using && or ||(logical operation)
				System.out.println(i+ " "+j);
			}
			System.out.println("done");
			}
}


//in for(int i=1,j=n;i<=n && j>=0;i++,j--)
//we can give multiple initialization and multiple increament                     
//and we can give multiple condition by using && or ||(logical operation)