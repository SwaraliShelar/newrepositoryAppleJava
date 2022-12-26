package PatternProgram;

public class PatternDiff2 {
public static void main(String[] args) {
/*	for(int i=1;i<=5;i++)          
	{
		for(int j=1;j<=(i*2-1);j++)
		{
			System.out.print(j);       
		}
		System.out.println();
	}*/
	
	int x=0;
	for(int i=1;i<=5;i++)        
	{                             
		for(int j=1;j<=(i+x);j++)
		{
			System.out.print(j);    
		}
		x=x+1;               
		System.out.println();
	}
}
}
