package Array2D;

import java.util.Scanner;

public class Array2DUsingScanner 
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    int r=3,c=3;
	    int a[] []=new int[r][c];
	    System.out.println("enter the array elements:");
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		System.out.print(a[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
		}
}
