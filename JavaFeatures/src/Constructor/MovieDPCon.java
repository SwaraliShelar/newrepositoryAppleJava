package Constructor;

import java.util.Scanner;

public class MovieDPCon {
	int yearOfRelease;
	String movieName,producerName,budget;
	MovieDPCon()
	{
		yearOfRelease=2014;
		movieName="siyaram";
		producerName="mr roa";
		budget="2.5cr";
	}
	MovieDPCon(int y,String m,String p,String b)
	{
		yearOfRelease=y;
		movieName=m;
		producerName=p;
		budget=b;
	}
	void display()
	{
		System.out.println(yearOfRelease+" "+movieName+" " +producerName+" "+budget);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter movie number:");
	num=sc.nextInt();
	
	for(int i=1;i<=num;i++)
	{
		System.out.println("enter details for movie:"+i+"\n");
		System.out.println("enter yearOfRelease,movieName,producerName and budget;");
		int yearOfRelease=sc.nextInt();
		String movieName=sc.next();
		String producerName=sc.next();
		String budget=sc.next();
		MovieDPCon m1=new MovieDPCon(yearOfRelease, movieName,producerName ,budget);
		m1.display();
	}
    System.out.println();
	MovieDPCon m2=new MovieDPCon();
	System.out.println("movie details in non parameterized con");
	m2.display();
	System.out.println();
    MovieDPCon m3=new MovieDPCon(2020,"3idiots","mr chopra","2cr");
	System.out.println("movie details in parameterized con");
    m3.display();
}

}
