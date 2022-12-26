/* print pattern 11)

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
package AssignmenProgramPattern;

public class PatternP11 {
public static void main(String[] args) {
	int r=6;
	for(char a='F';a>='A';a--)
	{
		for(char b='A';b<=a;b++)
		{
			System.out.print(b+" ");
		}
		System.out.println();
	}
	for(char a='A';a<='F';a++)
	{
		for(char b='A';b<=a;b++)
		{
			System.out.print(b+" ");
		}
		System.out.println();
	}
}
}
