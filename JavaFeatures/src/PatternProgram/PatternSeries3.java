//print series 1 2 6 33 289 3414

//  logic      1  1+(1^1=1)=2 2+(2^2=4)=6 6+(3^3=27)=33  33+(4^4=256)=289 289+(5^5=3125)=3414


package PatternProgram;

import java.util.Scanner;

public class PatternSeries3 {
	public static void main(String[] args)
	{
		int result = 1;
		for (int i = 1; i <= 6; i++) 
		{
			System.out.print(result + " ");
			result = result + (int) Math.pow(i, i);
		}

	}
}