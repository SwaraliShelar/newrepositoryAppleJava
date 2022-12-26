
public class PatternPractice {
public static void main(String[] args) {
	
   
        int alphabate=96;
        for(int i=5;i>=1;i--)//i=5          i=5 i=4   i=5 i=4 i=3 i=2 i=1
        {
        	for(int j=5;j>=i;j--)//j=5      j=5 j=4
        	{
        		System.out.print((char)(alphabate+j));//e=96+5=101  e d=96+4=100
        	}
        	System.out.println();
        }
  
}
}
