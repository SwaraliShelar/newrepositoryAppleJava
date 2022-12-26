package WrittenTest10;
//1.WAJP2 find sum of main diagonal elements of a matrix.
public class SumOfMainDiagonalElements 
{
public static void main(String args[])
{
	int sum=0;
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("Matrix:");
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
			if(i==j)
			{
			sum=sum+a[i][j];
			}
		}
	}
	System.out.println("sum of main digonal elements:"+sum);
}
}
