package WrittenTest10;
//2.WAJP2 find sum of lower triangular matrix.
public class SumOfLowerTrianglarMatrix 
{
public static void main(String[] args)
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int sum=0;
	System.out.println("matrix");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i>j)
			{
				sum=sum+a[i][j];
			}
		}
	}
	System.out.println("sum of lower triangular of matrix:"+sum);
}
}
