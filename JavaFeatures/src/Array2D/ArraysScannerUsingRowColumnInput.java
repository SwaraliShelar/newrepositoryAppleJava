package Array2D;

import java.util.Scanner;

public class ArraysScannerUsingRowColumnInput 
{
public static void main(String[] args) {
	int r=3,c=3;

	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number:");
	int a[][]=new int[r][c];
	 
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
}
}
	

