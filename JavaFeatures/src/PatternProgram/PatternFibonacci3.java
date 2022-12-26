/*print the series
0 
0 1 1 
0 1 1 2 3 
0 1 1 2 3 5 8 
0 1 1 2 3 5 8 13 21 

 */
package PatternProgram;

public class PatternFibonacci3 {
public static void main(String[] args) {
	int a=0,b=1,c;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=(i*2-1);j++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		a=0;
		b=1;
		System.out.println();
	}
	 
}
	int x=0;

	/*for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i+x;j++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		x=x+1;
		a=0;
		b=1;
		System.out.println();
	}*/
	
 
}
