/*
 14. WAP to print following Pattern
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */
package AssignmenProgramPattern;

public class PatternP14 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=5;i++)
	{
		for(int s=r-1;s>=i;s--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int s=1;s<=i;s++)
		{
			System.out.print(" ");
		}
		for(int j=4;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

