package Arrays2DAssignment;

public class SumOfMainDiagonal {
	public static void main(String[] args) {
		int a[][]={{2,5,3},{2,3,1},{1,1,1}};
		
		System.out.println("matrix:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("sum of main (Major) diagonal:");
		int sum=0;
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
		System.out.println(sum);
	}
}
