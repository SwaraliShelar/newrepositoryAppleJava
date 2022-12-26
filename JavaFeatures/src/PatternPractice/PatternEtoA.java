package PatternPractice;

public class PatternEtoA {
public static void main(String[] args) {
	for(char i='e';i>='a';i--)
	{
		for(char j='e';j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	for(char i='a';i<='e';i++)
	{
		for(char j='e';j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
