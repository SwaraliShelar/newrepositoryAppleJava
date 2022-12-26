/*15. WAP to print following Pattern

1 2 3 4 5
  2 3 4 5
  3 4 5
   4 5
    5	
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5


 */
package AssignmenProgramPattern;

public class PatternP15 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=i;k++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--)
	{
		for(int k=i;k>=1;k--)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
