package ArrayObject;

import java.util.Scanner;

public class MovieTheaterGSMain
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	TheaterGS tr[]=new TheaterGS[1];
		for(int i=0;i<tr.length;i++)
		{
			System.out.println("enter information about Theater:");
			System.out.println("Enter Theater id,name:");
			int tid=sc.nextInt();
			String tname=sc.next();
			
			MovieGS mo[]=new MovieGS[4];
			System.out.println("enter information about movie:");
			for(int j=0;j<mo.length;j++)
			{
				System.out.println("enter movie id,name,yearOfRelease:");
				int mid=sc.nextInt();
				String Mname=sc.next();
				int myear=sc.nextInt();
				
				MovieGS m=new MovieGS();
				
				m.setId(mid);
				m.setName(Mname);
				m.setYear(myear);
				
				mo[j]=m;
		    }
            TheaterGS t=new TheaterGS();
	   		
			t.setId(tid);
			t.setName(tname);
			tr[i]=t;
			t.setM(mo);
	    }
for(TheaterGS t:tr)
{
	for(MovieGS m:t.m)
	{
		if(m.year==2020)
		{
		System.out.println(m.getName()+" "+m.getYear());
		}
	}
}
}
}
