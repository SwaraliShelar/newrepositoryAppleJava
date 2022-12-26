package ArrayObject;

import java.util.Scanner;

public class MovieTeatermain
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a size:");
	int size=sc.nextInt();
	System.out.println("Enter a details for "+size+" theater that realeses a movies:");
	Theater tr[]=new Theater[size];
	System.out.println("Enter a details for 4 movies:");
	for(int i=0;i<tr.length;i++)
	{
		System.out.println("Theater id:");
		int tid=sc.nextInt();
		System.out.println("Theater name:");
		String tname=sc.next();
		
		Movie mo[]=new Movie[4];
		for(int j=0;j<mo.length;j++)
		{
			System.out.println("enter a movie id,name,yearOfRelease:");
			int mid=sc.nextInt();
			String mname=sc.next();
			int yor=sc.nextInt();
			mo[j]=new Movie(mid,mname,yor);
		}
		tr[i]=new Theater(tid,tname,mo);
	
	for(Movie m : mo)
	{
		if(m.yearOfRelease==2020)
		{
			System.out.print(m);
		}
	}
}
}
}