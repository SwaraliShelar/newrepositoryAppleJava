/*
    1
   12 
  123
 1234
12345 
 */
package PatternPractice;

public class One2 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=5;i++)
	{
		for(int k=r-1;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=5;i>=1;i--)
	{
		for(int k=r-1;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	for(int i=5;i>=1;i--)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1;i<=5;i++)
	{
		 for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
