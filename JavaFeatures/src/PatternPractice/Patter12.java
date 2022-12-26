/*       1
        12
       123
      1234
     12345
 */
package PatternPractice;

public class Patter12 {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=r;i++)
	{
		for(int k=1;k<=r-i;k++)//k=1            k=2         k=3            k=4                    k=5
		{//k is printed spaces   k<=5-5=0     k<=5-4=1     k<=5-3=2        k<=5-2=3             k<=5-1=3
			System.out.print(" ");//k=(0)    k=1(_)        k=2(__)         k=3(___)              k=4(____)
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		
	System.out.println();
	}
}
}
