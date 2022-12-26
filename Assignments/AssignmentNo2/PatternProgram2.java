package AssignmentNo2;

public class PatternProgram2 {
	public static void main(String[] args) {
		int r=5;
	
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}