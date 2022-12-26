package ClassesAndObjects;

import java.util.Scanner;

public class StudentIdNameMarks {
	void studentDetails(int id,String name,int sub1,int sub2,int sub3)
	{
		
		System.out.println("student id is :"+id+"\nstudent name is :"+name);
		System.out.println("marks of three subjects is:"+sub1+" "+sub2+" "+sub3);
	}
    float subjects(int sub1,int sub2,int sub3)
	{
		float total=(sub1+sub2+sub3);
		float per=(total/3);
		System.out.println("total marks : "+total+"\npercentage is : "+per+"%");
		return per;
	}
  
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student id:");
	int sid=sc.nextInt();
	System.out.println("enter a student name:");
	String sname=sc.next();
	System.out.println("enter a student marks for subject 1:");
	int s1=sc.nextInt();
	System.out.println("enter a student marks for subject 2:");
	int s2=sc.nextInt();
	System.out.println("enter a student marks for subject 3:");
	int s3=sc.nextInt();
	
	StudentIdNameMarks std=new StudentIdNameMarks();
	std.studentDetails(sid,sname,s1,s2,s3);
	float ssubjects=std.subjects(s1,s2,s3);
	
	
}
}
