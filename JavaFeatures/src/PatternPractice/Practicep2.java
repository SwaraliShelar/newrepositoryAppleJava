package PatternPractice;

public class Practicep2 {
public static void main(String[] args) {
	int alphabate=96;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
	System.out.println();

	for(int i=5;i>=1;i--)
	{
		for(int k=1;k<=5-1;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=1;i<=5;i++)
	{
		for(int k=5-1;k>=1;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
	System.out.println();
	
	int r=5;
	for(int i=1;i<=r;i++)
	{
		for(int k=r-1;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
	System.out.println();
	

	for(int i=r;i>=1;i--)
	{
		for(int k=r-1;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
}
}
