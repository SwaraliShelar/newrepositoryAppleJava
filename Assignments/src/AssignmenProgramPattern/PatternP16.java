/*16)
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F
*/
package AssignmenProgramPattern;

public class PatternP16 {
public static void main(String[] args) {
	int alphabate=64;
	int r=6;
	for(int i=1;i<=r;i++)
	{
		for(int k=r;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(alphabate+j)+" ");
		}
		System.out.println();
	}
}
}
