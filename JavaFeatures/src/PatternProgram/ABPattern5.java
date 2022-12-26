package PatternProgram;

public class ABPattern5 {
	public static void main(String[] args) {
		
		//when we have to print alphabate then use char i,j
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		}
	}

