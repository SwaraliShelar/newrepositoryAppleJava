package Array2D;

public class WithinSameMatrixTranposeUsingTemp 
{
public static void main(String[] args) 
{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println("Original matrix:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i!=j && i<j)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
	}
	
	System.out.println("transpose matrix:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
}
}
