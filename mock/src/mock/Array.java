package mock;

public class Array
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5,6};
	int sum=0;
	for(int i=0;i<a.length-1;i+=2)
	{
		sum=a[i]+a[i+1];
		System.out.println(sum);
	}
}
}
