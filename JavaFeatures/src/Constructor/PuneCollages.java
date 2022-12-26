package Constructor;

import java.util.Scanner;

public class PuneCollages {
int id,dno,stuno;
String name,location;
static String uniName="Pune Univercity";
static String state="Maharashtra";
PuneCollages(int id,int dno,int stuno,String name,String location)
{
	 this.id=id;
     this.dno=dno;
     this.stuno=stuno;
	 this.name=name;
	 this.location=location;
}
void display()
{
	System.out.println("collage id:"+id+"\n"+"number of departmens:"+dno+"\n"+"number of students in collage:"+stuno+"\n"+"collage name:"+name+"\n"+"collage location:"+location);
	System.out.println("univercity name:"+PuneCollages.uniName+"\n"+"State:"+PuneCollages.state);
}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("enter pune collage number:");
	num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		System.out.println("enter inforamation about pune collages:"+i+"\n");
		System.out.println("enter id,number of dept,number of students,collage name,collage location:");
		int id=sc.nextInt();
		int dno=sc.nextInt();
		int stuno=sc.nextInt();
		String name=sc.next();
		String location=sc.next();
		PuneCollages pnc1=new PuneCollages( id,dno,stuno,name,location);
		pnc1.display();
	}
	System.out.println();
	PuneCollages pnc2=new PuneCollages(3,30,5000,"dypatil","shivaji nagar");
	pnc2.display();	
}
}
