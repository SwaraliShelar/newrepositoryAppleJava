package PatternPractice;

public class Pattern01234 {
public static void main(String[] args) {
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=4;j++)
		{
			if(i==j)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(0);
			}
		}
		System.out.println();
	}
}
}
