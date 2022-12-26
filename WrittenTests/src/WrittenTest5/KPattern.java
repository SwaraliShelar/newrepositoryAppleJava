/*3. 2)	Print the pattern:


 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
 */
package WrittenTest5;

public class KPattern {
	public static void main(String[] args) {	
	int alpha=64;
	for(int i=6;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+alpha)+" ");
		}
		System.out.println();
	}
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+alpha)+" ");
		}
		System.out.println();
	}
}
}