package Array2D;

public class ProductsOfArrays
{
public static void main(String[] args)
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("elements are:"+a.length);
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("product of all elements in array:");
	int product=1;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
		product=product*a[i][j];	
		}
	}
	System.out.println(product);
	
	System.out.println("product of major diagonal elements:");
	int product1=1;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i==j)
			{
			product1=product1*a[i][j];
			}
		}
	}
	System.out.println(product1);
	
	
	System.out.println("product of upper triangular elements:");
	int product2=1;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i<j)
			{
				product2=product2*a[i][j];
			}
		}
	}
	System.out.println(product2);
	
	
	System.out.println("product of lower triangular elements:");
	int product3=1;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i>j)
			{
				product3=product3*a[i][j];
			}
		}
	}
	System.out.println(product3);
	
	
	for(int i=0;i<a.length;i++)
	{
		int product4=1;
		for(int j=0;j<a[i].length;j++)
		{
		  product4=product4*a[i][j];
		}
		System.out.println("product of row elements:"+product4);
	}
}
}
