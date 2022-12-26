package Array;

public class MissingElementInArray 
{

	public static void main(String[] args)
	{
    int a[]=  {1,2,3,6,7,8,10};
    int j=1;//j is  not a array is just value
    System.out.println("Missing number in array is:");
   /* for(int i=0;i<a.length;i++)
    {
    	if(a[i]!=j)//j is  not a array is just value
    	{
    		System.out.print(j+" ");
    		i--;
    	}
    	j++;
    }*/
    
    
    int cnt=0;
    int le=a.length;
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
    }
	}

}
