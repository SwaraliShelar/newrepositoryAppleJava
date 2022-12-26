package Constructor;

import java.util.Scanner;

public class PuneStatic
{
int id,dno,sno;
String collname,location;
static String univercity="pune univercity";
static String state="maharashtra";
    PuneStatic(int id,int dno,int sno,String collname,String location)
    {
	this.id=id;
	this.dno=dno;
	this.sno=sno;
	this.collname=collname;
	this.location=location;
    }
	static void ChageVariable(String newuniname)
	{
		 univercity=newuniname;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("department numbers:"+dno);
		System.out.println("students numbers:"+sno);
		System.out.println("collage name:"+collname);
		System.out.println("collage location:"+location);
		System.out.println("univercity name:"+univercity);
		System.out.println("state name:"+state);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
		System.out.println("enter collage details for collage:"+i+"\n");
		System.out.println("enter id:");
		int id=sc.nextInt();
		System.out.println("enter department numbers in collage:");
		int dno=sc.nextInt();
		System.out.println("enter students numbers in collage:");
		int sno=sc.nextInt();
		System.out.println("enter collage name :");
		String name=sc.next();
		System.out.println("enter collage location:");
		String location=sc.next();
		PuneStatic ps1=new PuneStatic(id,dno,sno,name,location);
		ps1.display();
		PuneStatic.ChageVariable("savitribai phule univercity");
		ps1.display();
		}
	}
}
