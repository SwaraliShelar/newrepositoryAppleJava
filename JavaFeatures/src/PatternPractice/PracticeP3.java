package PatternPractice;

public class PracticeP3 {
public static void main(String[] args) {
	int alphabate =96;
	int r=4;
	for(int i=r;i>=1;i--)
	{
		for(int k=1;k<=r-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j)+" ");
		}
		System.out.println();
	}
	for(int i=1;i<=r;i++)
	{
		for(int k=r-1;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j)+" ");
		}
		System.out.println();
	}
}
}
