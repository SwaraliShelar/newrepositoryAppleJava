/*2.	Draw the patterns create a separate method for each:
*
**
***
****


0
11
000
1111

 */
package WrittenTest3;
	import java.util.Scanner;

	public class Pattern 
	{
		void star(int row)
		{
		
			for (int i = 1; i <= row; i++) 
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		void binary(int row)
		{

			for (int i = 1; i <= row; i++) 
			{
				for (int j = 1; j <= i; j++) 
				{
					if (i % 2 == 0)
						System.out.print(1);
					else
						System.out.print(0);
				}
				System.out.println();
			}
			}
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a row number:");
		        int r=sc.nextInt();
				Pattern ptr=new Pattern();
				ptr.star(r);
				ptr.binary(r);
			}
			}


