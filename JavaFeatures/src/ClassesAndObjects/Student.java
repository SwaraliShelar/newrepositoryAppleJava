package ClassesAndObjects;

import java.util.Scanner;

public class Student {
	int id ;int marks;
	String name;String dept;
	void setData(int i,int m,String n,String d)
	{
		id=i;
		marks=m;
		name=n;
		dept=d;
	}
	void showData()
	{
		System.out.println(id+" "+marks+" "+name+" "+dept);
	}
//when we create multiple objects s1,s2,s3,s4 
//then you also have to set values 4 times others for 4 objects same value got set
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id:");
		int sid=sc.nextInt();
		System.out.println("enter a student marks:");
		int smarks=sc.nextInt();
		System.out.println("enter a student name:");
		String sname=sc.next();
		System.out.println("enter a student dept:");
		String sdept=sc.next();	
	
		Student s1=new Student();
		s1.setData(sid, smarks, sname, sdept);
			
		
	    System.out.println("Enter student id:");
		sid=sc.nextInt();
		System.out.println("enter a student marks:");
		smarks=sc.nextInt();
		System.out.println("enter a student name:");
		sname=sc.next();
		System.out.println("enter a student dept:");
	    sdept=sc.next();	
		
		Student s2=new Student();
		s2.setData(sid, smarks, sname, sdept);
		
		
		System.out.println("Enter student id:");
		sid=sc.nextInt();
		System.out.println("enter a student marks:");
		smarks=sc.nextInt();
		System.out.println("enter a student name:");
		sname=sc.next();
		System.out.println("enter a student dept:");
	    sdept=sc.next();
		
		Student s3=new Student();
		s3.setData(sid, smarks, sname, sdept);
		
		
		System.out.println("Enter student id:");
		sid=sc.nextInt();
		System.out.println("enter a student marks:");
		smarks=sc.nextInt();
		System.out.println("enter a student name:");
		sname=sc.next();
		System.out.println("enter a student dept:");
	    sdept=sc.next();	
		
		Student s4=new Student();
		s4.setData(sid, smarks, sname, sdept);
		s1.showData();
		s2.showData();	
		s3.showData();	
		s4.showData();	
}
}
