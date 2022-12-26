package Array2D;

import java.util.Scanner;

public class AdditionAndMultiplicationOfMatrix 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row number:");
	int r=sc.nextInt();
	System.out.println("enter the column number:");
	int c=sc.nextInt();
	
	
	
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];

	System.out.println("enter the elements in 1st matrix:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	System.out.println("enter the elements in 2nd matrix:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}
	
	int result1[][]=new int[r][c];
	System.out.println("Multiplication of two matrices is:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			result1[i][j]=a[i][j]*b[i][j];
		}
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(result1[i][j]+"\t");
		}
		System.out.println();
	}
	
	int result[][]=new int[r][c];
	System.out.println("Addition of two matrices is:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			result[i][j]=a[i][j]+b[i][j];
		}
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(result[i][j]+"\t");
		}
		System.out.println();
	}
}
}
