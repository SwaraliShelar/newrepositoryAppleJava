package PatternProgram;

public class RightTrianglPattern7 {
	public static void main(String[] args) {
		
		int r=4;//rows=4
			for(int i=1;i<=r;i++) 
			{
				for(int k=1;k<=r-i;k++)
				{
					System.out.print(" ");
				}
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");//when we are not give space after * then is right angle
					}
					System.out.println();
				}
		}
}
