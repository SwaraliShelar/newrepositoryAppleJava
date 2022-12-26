package Array;

public class FindSquareinArray 
{

public static void main(String[] args) 
{
	int a[]= {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
	for(int i=0;i<a.length;i++)
	{
		/*double sqrt=Math.sqrt(a[i]);//perfect sq=sqrt will be a whole number
		//if(sqrt==Math.floor(sqrt))
		//System.out.println(a[i]);*/
		
		double sqrt=Math.sqrt(a[i]);//perfect sq=sqrt will be a whole number
		int sqroot=(int)sqrt;
		if(sqrt==sqroot)
		System.out.println(a[i]);
	}
	
			
}
}
