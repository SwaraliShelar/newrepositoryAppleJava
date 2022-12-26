package Arrays2DAssignment;

public class LowerTraingular 
{
	public static void main(String[] args) 
	{
		int a[][]={{4,5,6},{3,4,1},{1,2,3}};
		
		System.out.println("Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("lower triangular elements:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>j)
				{
				System.out.print(a[i][j]+"\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("sum lower triangular elements:");
		int sum=0;
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
		System.out.println(sum);

	}

}
