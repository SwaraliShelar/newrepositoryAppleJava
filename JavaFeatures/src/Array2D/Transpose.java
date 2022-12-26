package Array2D;

import java.util.Scanner;

public class Transpose
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);

int r =3,c=2;
System.out.println("enter a elements:");
int a[][]=new int[r][c];	
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