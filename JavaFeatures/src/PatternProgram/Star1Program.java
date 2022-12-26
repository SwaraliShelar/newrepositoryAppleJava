package PatternProgram;

public class Star1Program {
public static void main(String[] args) {
	int row=4;
			
	
	for(int i=1;i<=4;i++)//i=1   i=2   i=3  i=4  
	{
		for(int j=1;j<=i;j++)//j=1 j=2 j=3 j=4
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("\n   ---------------------------------   \n");
	
for(int i=4;i>=1;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
}









}
