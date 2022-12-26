package PatternProgram;

public class PeramidPattern6 {
public static void main(String[] args) {
	
int r=4;//rows=4  i is used to print nextline ,k is used to print spaces,j is used to print * 
	for(int i=1;i<=r;i++) //         i=1                i=2              i=3              i=4 
	{
		for(int k=1;k<=r-i;k++)//k=1 k=2 k=3 k=4     k=1 k=2 k=3       k=1 k=2            k=1 
		{
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++)//  j=1              j=1 j=2         j=1 j=2 j=3     j=1 j=2 j=3 j=4
			{
				System.out.print("* ");//when we are  give space after * then is peramyde
			}
			System.out.println();
		}
}
}
