package Array;

public class ArrayLiterals {
 
	void arrayLength(int a[])
	{
		System.out.println("Length of array elements:"+a.length);
	}
	void arrayElement(int a[])
	{
		System.out.println("Array elements is:");
		for(int i=0;i<a.length;i++)//i<=a.length-1
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void arraySearcElement(int a[],int element)
	{
		int cnt=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Element is present at a index:"+i);
			}
			else
				cnt++;	
		}
		if(cnt==a.length)	
			System.out.println("elements are not present");
	
	}
	void arrayAlternatElement(int a[])
	{ 
		System.out.println("Alternate elements are:");
		for(int i=0;i<=a.length-1;i+=2)//i=i+2
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int arr[]= {10,20,30,40,50,30,60,70,80,90,30,100};
        ArrayLiterals al=new  ArrayLiterals();
        al.arrayLength(arr);
        al.arrayElement(arr);
        al.arraySearcElement(arr, 30);
        al.arrayAlternatElement(arr);
	}

}
