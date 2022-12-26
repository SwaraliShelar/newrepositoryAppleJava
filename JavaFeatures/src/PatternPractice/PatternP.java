/*
 54321 12345     12345 54321
 5432   1234     1234   5432
 543     123     123     543
 54       12     12       54
 5         1     1         5
 */
package PatternPractice;

public class PatternP {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	int r=5;
	for(int i=r;i>=1;i--)
	{
		for(int k=1;k<=r-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		
		System.out.println();
	}
	int r1=5;
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=+i;k++)
		{
			System.out.print(" ");
		}
		for(int j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
