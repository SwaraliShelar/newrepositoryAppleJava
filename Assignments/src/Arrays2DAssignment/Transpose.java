package Arrays2DAssignment;

import java.util.Scanner;

/*2. WAJP2 create transpose of a matrix (transpose is converting rows to 
columns) and print it.*/
public class Transpose 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements:");
	int r=3,c=2;
	int a[][]=new int [r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	
	
	int b[][]=new int[c][r];
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<r;j++)
		{
			b[i][j]=a[j][i];
		}
	}
	
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<r;j++)
		{
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}
	
}
}
