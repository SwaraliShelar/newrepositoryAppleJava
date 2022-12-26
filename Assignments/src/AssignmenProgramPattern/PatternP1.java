/*   1)

  
 *****
  ****
   ***
    **
     *   
         */
     
package AssignmenProgramPattern;

public class PatternP1 {
	public static void main(String[] args) {
		int r = 5;           
		for(int i=r;i>=1;i--)//i=5                 i=4          i=3             i=2                   i=1
		{
			for(int k=1;k<=r-i;k++)//k=1            k=2         k=3            k=4                    k=5
			{//k is printed spaces   k<=5-5=0     k<=5-4=1     k<=5-3=2        k<=5-2=3             k<=5-1=3
				System.out.print(" ");//k=(0)    k=1(_)        k=2(__)         k=3(___)              k=4(____)
			}
			for(int j=1;j<=i;j++)    //j=1        j=1 j=2    j=1 j=2 j=3  j=1 j=2 j=3 j=4 j=4  j=1 j=2 j=3 j=4 j=4 j=5
			{                       //1<=5        2<=5         3<=5               4<=5                5<=5
				System.out.print("*");//*****
			}                         // ****
			System.out.println();    //   ***
		}                           //     **
		                           //       *
}
}


