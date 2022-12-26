//1. create class Student and create 2 objects of Student using new keyword

package AssignmentNo3;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	int marks;
	String dept;
void acceptDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student id:");
	 id=sc.nextInt();
	System.out.println("Enter student name:");
     name=sc.next();
	System.out.println("Enter student marks:");
	marks=sc.nextInt();
	System.out.println("Enter student dept:");
	 dept=sc.next();
}
void showDetails()
{
	System.out.println("student id:"+id+" "+"student name:"+name+" "+"student marks:"+marks+" "+"student dept:"+dept);
}
public static void main(String[] args)
{
	
	Student s1=new Student();
	s1.acceptDetails();
	
	Student s2=new Student();
	s2.acceptDetails();
	s1.showDetails();
	s2.showDetails();
	
	
}
}
