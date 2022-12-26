/*print  9
        898
       78987
      6789876
     567898765
    45678987654
   3456789876543
  234567898765432
 12345678987654321
*/

package PatternProgram;

public class PatternPrint9876 {
	public static void main(String[] args)
	{
		int r = 9;
		for (int i = r; i >= 1; i--)
		{
			for(int l=1;l<=i;l++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=r-1;j++)
			{
				System.out.print(j);
			}
			for(int k=r;k>=i;k--)
			{
				System.out.print(k);
			}
		System.out.println();
		}
	}
}
