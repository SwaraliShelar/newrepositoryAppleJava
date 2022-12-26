package Arrays2DAssignment;
//4. WAJP2 find sum of each row and column of a matrix. 
public class SumOfEachRowColumns 
{
	public static void main(String[] args) {
		
	
	int r=3,c=3;
	int a[][]={{4,5,6},{3,4,1},{1,2,3}};
    int sum=0;
    
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	
    System.out.println("Sum of each row and column of matrix is:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[i][j];
		}
	}
	System.out.println(sum);
	
	System.out.println("Sum of each row matrix is:");	
	for(int i=0;i<a.length;i++)
	{
		int sum1=0;
		for(int j=0;j<a.length;j++)
		{
			sum1=sum1+a[i][j];
		}
		System.out.println(sum1);
	}
	
}
}