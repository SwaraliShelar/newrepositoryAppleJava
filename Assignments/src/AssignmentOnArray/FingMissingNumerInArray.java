package AssignmentOnArray;
/*10. Write a Java program to find a missing number in an array. Means e.g. array has 1 
to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5
*/
public class FingMissingNumerInArray 
{

	public static void main(String[] args) 
	{
    int a[]= {1,2,3,6,7,8,10};
    System.out.println("Missing number in array is:");
    int j=1;
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]!=j)
    	{
    		System.out.print(j+" ");
    		i--;
    	}
        j++;		
    }
    
    /* int le=a.length;
    int cnt=0;
    for(int i=a[0];i<a[le-1];i++)
    {
    	if(a[cnt]==i)
    	{
    		cnt++;
    	}
    	else
    	{
    		System.out.print(i+" ");
    	}
    }*/
}

}
