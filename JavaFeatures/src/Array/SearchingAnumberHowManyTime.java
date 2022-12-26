package Array;

public class SearchingAnumberHowManyTime
{
	public static void main(String[] args)
	{
		int cnt=0;
    int a[]= {10,20,50,30,10,20,70,80,90};
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]==10)
    	{
        cnt++;
	    }
    }
    System.out.println("10 is repeat "+cnt+" in array");
}
}