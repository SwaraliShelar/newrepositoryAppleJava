package ClassesAndObjects;

import java.util.Scanner;

public class StudeHash {
	int id,marks;
	String name,dept;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter for student:id,marks,name,dept");
		id=sc.nextInt();
		marks=sc.nextInt();
		name=sc.next();
		dept=sc.next();
	}
	public String toString()
	{
		return id+" "+marks+" "+name+" "+dept;
	}
	
public static void main(String[] args) 
{
	
	 StudeHash sh1=new  StudeHash();
	 sh1.setdata();
	 StudeHash sh2=new  StudeHash();
	 sh2.setdata();
	 
	 //display hashCode
	 System.out.println(sh1.hashCode());
	 System.out.println(sh2.hashCode());
	 
	 System.out.println(sh1);
	 System.out.println(sh2);

}
}
