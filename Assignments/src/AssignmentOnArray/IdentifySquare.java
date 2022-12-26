package AssignmentOnArray;
/*21. WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 
9, 78, 66, 39, 0] so output is 25, 49, 9.*/
public class IdentifySquare
{
public static void main(String[] args)
{
	int a[]= {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
    for(int i=0;i<a.length;i++)
    {
    	double sqrt=Math.sqrt(a[i]);
    	if(sqrt==Math.floor(sqrt))
    		System.out.println(a[i]);
    	
       /*double sqrt=Math.sqrt(i);
        int sqroot=(int)sqrt;
    	if(sqroot==sqrt)
    	System.out.println(a[i]);*/
    }
}
}
