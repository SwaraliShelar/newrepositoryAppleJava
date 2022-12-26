
public class ArrayTracing
{

int sum=0;
void addElements(int a[])
{
	System.out.println("sum of all elements of  array:");
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
}
void evenElements(int a[])
{
	System.out.println("even elements in array:");
	int min=0,max=0;
	for(int i=0;i<a.length;i++)
	{
	if(a[i]%2==0)
	{
		System.out.print(a[i]+" ");
	}
	}

	System.out.println("\nodd elements in array:");
	for(int i=0;i<a.length;i++)
	{
	if(a[i]%2!=0)
	{
		System.out.print(a[i]+" ");
	}
	}
	
}
void MinMax(int a[])
{
	int max=a[0];
	System.out.println("\nmaximum value in array:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.print(max);

	int min=a[0];
	System.out.println("\nminimum value in array:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.print(min);

}
public static void main(String[] args)
{
	ArrayTracing at=new ArrayTracing();
	int arr[]= {11,20,30,40,55,60};
	at.addElements(arr);
	at.evenElements(arr);
	at.MinMax(arr);
}
}
