package ClassesAndObjects;

import java.util.Scanner;

public class Studentfor {
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studentfor s1=new Studentfor();
		int num;
		System.out.println("Enter number of student: ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println("enter information for student:"+i+"\n");
		    System.out.println("Enter student id:");
			int sid=sc.nextInt();
			System.out.println("enter a student marks:");
			int smarks=sc.nextInt();
			System.out.println("enter a student name:");
			String sname=sc.next();
			System.out.println("enter a student dept:");
		    String sdept=sc.next();	
			s1.setData(sid, smarks,sname, sdept);        
			s1.showData();
		}
	
		
	}
}
