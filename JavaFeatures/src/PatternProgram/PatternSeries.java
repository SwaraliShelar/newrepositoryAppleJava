// print the series 1 2 6 15 31 56

//logic is    j=1   j=1+(1*1)=2   j=2+(2*2)=6   j=6+(3*3)=15   j=15+(4*4)=31    j=31+(5*5)=56

package PatternProgram;

public class PatternSeries {
	public static void main(String[] args)
	{
		int j = 1;                   //j=1            
		for (int i = 1; i <= 6; i++) //i=1               i=2           i=3            i<=4             i=5         i=6       but(i<=6)
		{
			System.out.print(j + " ");//j=1              j=2           j=6            j=15            j=31         j=56
			j = j + (i * i);          //j=1+(1*1)=2   j=2+(2*2)=6   j=6+(3*3)=15   j=15+(4*4)=31    j=31+(5*5)=56  j=56+(6*6)=92
		}

	/*  using while loop
		int num=60,i=1,j=1;
		if(num>0)
		{
			while(i<=num)
			{
				System.out.print(i+" ");
				i=i+(j*j);
				j++;
			}
		}
	*/
	}
}
