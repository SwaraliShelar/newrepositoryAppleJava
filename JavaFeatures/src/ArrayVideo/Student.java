package ArrayVideo;

import java.util.Arrays;

public class Student
{
int id,marks[];
String name;
Student() {}
Student(int id,String name,int [] marks) 
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}
void display()
{
	System.out.println("Student id:"+id);
	System.out.println("Student name:"+name);
	System.out.println("student marks achieved in differrent subject:");
	System.out.println(Arrays.toString(marks));
}
public static void main(String[] args)
{
	int recordM1[]= {87,67,98,56,89};
	int recordm2[]= {67,59,87,90,76};
	
	Student s1=new Student(1,"pooja",recordM1);
	Student s2=new Student(2,"shweta",recordm2);
	s1.display();
	s2.display();
}
}
