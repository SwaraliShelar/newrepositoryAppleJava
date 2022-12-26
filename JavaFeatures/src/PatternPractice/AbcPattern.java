package PatternPractice;

public class AbcPattern {
public static void main(String[] args) {
	int alpha=97;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<i*2;j++)
		{
			System.out.print((char)alpha);
			alpha++;
		}
		System.out.println();
	}
	System.out.println();
	int alpha1=65;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<2*i;j++)
		{
			System.out.print((char)alpha1);
			alpha1++;
		}
		System.out.println();
	}
	System.out.println();
	int alpha11=97;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<2*i;j++)
		{
			System.out.print((char)alpha11);
		}
		System.out.println();
	}
	System.out.println();
	int alpha12=65;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<2*i;j++)
		{
			System.out.print((char)alpha12);
		}
		System.out.println();
	}
}
}
