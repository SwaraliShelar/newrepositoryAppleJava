/*
 print edcba
       edcb
       edc
       ed
       e
 */
package PatternPractice;

public class Practicep1 {
public static void main(String[] args) {
	int alphabate =96;
	for(int i=5;i>=1;i--)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print((char)(alphabate+j));
		}
		System.out.println();
	}
}
}
