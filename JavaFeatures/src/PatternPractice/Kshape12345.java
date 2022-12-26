/* 15. WAP to print following Pattern


   12345     (without space same program)
   2345
   345
   45
   5
   45
   345
   2345
   12345
 */
package PatternPractice;

public class Kshape12345 
{
public static void main(String[] args)
{
	
	for(int i=1;i<=5;i++)      //i=1                              i=2                         i=3               i=4                 i=5    i=6
	{
		for(int j=i;j<=5;j++)//(j=i=1)j=1 j=2 j=3 j=4 j=5  (j=i)j=2 j=3 j=4 j=-5      (j=i=3)j=3 j=4 j=5   (j=i=4) j=4 j=5   (j=i=5)j=5   (j=i=6)j=6
		{
			System.out.print(j+" ");//j=1 2 3 4 5                 //j=2 3 4 5                //j=3 4 5           //j=4 5               //j=5
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
