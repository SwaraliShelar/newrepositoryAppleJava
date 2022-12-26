import java.util.Scanner;

public class SearchelementisPresentinArraynot 
{
public static void main(String[] args) 
{
	int a[]= {10,20,30,40,50};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter element to search:");
	int b=sc.nextInt();
	int cnt=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==b)
		{
			cnt++;
			System.out.print(" at "+i+" position");
		}
	}	
	if(cnt==1)
	{
		System.out.print(b+" is present");
	}
	else
	{
		System.out.print(b+" is not present ");
	}
}
}