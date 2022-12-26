package ClassesAndObjects;

import java.util.Scanner;

public class StudentInfo {
int id;int marks;
String name;String dept;

void setData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a student id:");
	id=sc.nextInt();//initialize the global variables via method
	System.out.println("enter a student marks:");
	marks=sc.nextInt();
	System.out.println("enter a student name:");
	name=sc.next();
	System.out.println("enter a student dept:");
	dept=sc.next();	
}
void showData()
{
	System.out.println(id+" "+marks+" "+name+" "+dept);
}
public static void main(String[] args) {
	StudentInfo s1=new StudentInfo();//s1,s2,s3 are refernce variables
	s1.setData();
	
	StudentInfo s2=new StudentInfo();
	s2.setData();
	
	StudentInfo s3=new StudentInfo();
	s3.setData();
	
	s1.showData();
	s2.showData();
	s3.showData();


}
}
