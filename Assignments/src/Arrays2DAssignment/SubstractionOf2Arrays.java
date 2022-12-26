package Arrays2DAssignment;

public class SubstractionOf2Arrays 
{
public static void main(String[] args) 
{
	int r=3,c=3;
	int a[][]={{4,5,6},{3,4,1},{1,2,3}};
	int b[][]={{2,0,3},{2,3,1},{1,1,1}};
	int[][] result=new int [r][c];
    
	System.out.println("First matrix:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("Second matrix:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			result[i][j]=a[i][j]-b[i][j];
		}
	}
	
	System.out.println("difference between 1st and 2nd matrix is:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(result[i][j]+"\t");
		}
		System.out.println();
	}
}
}
