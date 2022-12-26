package WrittenTest10;

import java.util.Scanner;

//3.WAJP2 check Symmetric matrix (i.e the matrix must be equal to its transpose)
public class Symmetric
{
public static void main(String[] args)
{
	//int a[][]= {{1,2,3},{4,5,6}};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row number:");
	int r=sc.nextInt();
	System.out.println("enter the column number:");
	int c=sc.nextInt();
	int a[][]=new int [r][c];
	System.out.println("enter the matrix values:");
	System.out.println("Matrix:");
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
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	System.out.println("Transpose Matrix:");
	int b[][]=new int [c][r];
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
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	
	int count=1;
	for(int i = 0; i < a.length ; i++)
	{
		for(int j = 0; j < a[i].length; j++)
		{
			if(a[i][j] != b[i][j])
			{
				count++;
				break;
			}
		}
	}
	
	if(count == 1) {
		System.out.println("\nIt is a Symmetric Matrix");
	}
	else {
		System.out.println("\nIt is Not Symmetric Matrix");
	}
}
}
