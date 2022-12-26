/*
     1
    *2*
   **3**

 */
package PatternPractice;

public class Onetwo {
public static void main(String[] args) {
	
	int r=2;
		for( int i=1;i<=3;i++)
		{
			for(int k=r;k>=1;k--)
			{
				System.out.print(" ");
			}
			for( int j=i-1;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println(i);
			
		}
		
	
}
}
