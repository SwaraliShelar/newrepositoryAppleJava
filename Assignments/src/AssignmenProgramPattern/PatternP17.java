/*17)
F E D C B A 
F E D C B 
F E D C 
F E D 
F E 
F 
 */
package AssignmenProgramPattern;

public class PatternP17 {
public static void main(String[] args) {
	int alphabate=64;
	
	for(int i=1;i<=6;i++)
	{
		for(int j=6;j>=i;j--)
		{
			System.out.print((char)(alphabate+j)+" ");
		}
		System.out.println();
	}
}
}
