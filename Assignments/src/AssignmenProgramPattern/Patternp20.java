/*20  WAP to print following Pattern
	1 1 1 1 1
	1 1 1 2 2
	1 1 3 3 3
	1 4 4 4 4
	5 5 5 5 5
 */
package AssignmenProgramPattern;

public class Patternp20 {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(1+" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
