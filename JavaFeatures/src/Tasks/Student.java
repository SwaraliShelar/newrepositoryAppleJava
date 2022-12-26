package Tasks;

import java.util.Scanner;

public class Student {
int id;
String name;
String email;
	void studentDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id:");
		id=sc.nextInt();
		System.out.println("enter student name:");
		name=sc.next();
		System.out.println("enter student email:");
		email=sc.next();
	}
	void studentDisplay()
	{
		System.out.println("student id:"+id+"   "+"student name:"+name+"   "+"student email:"+email);
	}
		public static void main(String[] args)
		{
			Student s1=new Student();
			s1.studentDetails();
			Student s2=new Student();
			s2.studentDetails();

			s1.studentDisplay();
			s2.studentDisplay();

	}
}

