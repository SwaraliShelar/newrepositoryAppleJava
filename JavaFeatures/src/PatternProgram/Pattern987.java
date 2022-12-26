package PatternProgram;

public class Pattern987 {
	public static void main(String[] args) {
		int r = 9;
		for (int i = r; i >= 1; i--) 
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for (int y = i; y <= r; y++)
			{
				System.out.print(y);
			}
			for (int x = r - 1; x >= i; x--) 
			{
				System.out.print(x);
			}

			System.out.println();
	}
}
}