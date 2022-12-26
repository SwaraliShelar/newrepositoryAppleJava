/* print a pattern
   1
  *2*
 **3**
 */
package PatternPractice;

public class Thinktiv2 
{
	public static void main(String[] args)
	{

		for(int i =1;i<=3;i++)
		{
			for(int j =2;j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 2;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j = i;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j = 2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}