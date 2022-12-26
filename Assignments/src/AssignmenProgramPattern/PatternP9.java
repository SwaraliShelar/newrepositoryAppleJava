/*9) print 




12345678987654321
 123456787654321
  1234567654321
   12345654321
    123454321
     1234321
      12321
       121
        1
 */
package AssignmenProgramPattern;

public class PatternP9 {
public static void main(String[] args) {
	int r=9;
	for(int i=9;i>=1;i--)
	{
		
		for(int l=i-1;l<=r;l++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}

		for(int p=i-1;p>=1;p--)
		{
			System.out.print(p);
		}
		System.out.println();
	}
}
}
