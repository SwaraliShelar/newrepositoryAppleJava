/* 21	WAP to print following Pattern

	0 0 0 0 0
	0 1 0 0 0
	0 0 2 0 0
	0 0 0 3 0
	0 0 0 0 4
 */
package AssignmenProgramPattern;

public class PatternP21 {
public static void main(String[] args) {
	for(int i=0;i<=4;i++)//i=0                      i=1                                   i=2                              i=3                   i=4
	{ 
		for(int j=0;j<=4;j++)//j=0 j=1 j=2 j=3 j=4  j=0 (i=j=1) j=2 j=3 j=4       j=0 j=1(i=j=2) j=3 j=4     j=0 j=1 j=2(i=j=3) j=4   j=0 j=1j=2 j=3 (i=j=4) 
		{
			if(i==j)
			{
			System.out.print(j); // 0                  1                                    2                               3                       4
			}
			else
			{
			System.out.print(0);//00000              01000                               00200                           00030                   00004
		    }
		}
		System.out.println();
	}
}
}

