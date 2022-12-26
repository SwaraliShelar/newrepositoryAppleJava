package AssignmenProgramPattern;

public class PatternP5 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=5;i++)         //i=1     i=2             i=3           i=4             i=5
	{
		System.out.print("*"); //*           *               *              *              *
		for(int j=1;j<=i;j++)//j=1         j=1 j=2      j=1 j=2 j=3   j=1 j=2 j=3 j=4    j=1 j=2 j=3j=4 j=5
		{                 
			System.out.print(j);//*1         *12            *123          *1234           *12345
		}
		for(int l=i-1;l>=1;l--)//l=1-1=0    l=2-1=1     l=3-1=2 l=1    l=4-1=3 l=2 l=1   l=5-1=4 l=3 l=2 l=1
		{
			System.out.print(l);//0           1              2 1           321               4321
		}
		System.out.println("*");//*           *               *             *                 *
	}//the final output is       *1*         *121*         *12321*       *1234321*      *123454321*
	
	
		for(int i=4;i>=1;i--)
		{
			System.out.print("*");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println("*");
		}
	
}
}
