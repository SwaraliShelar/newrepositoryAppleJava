package Inheritance.ParentChild;

import java.util.Scanner;

public class PersonStudentFacultyMain
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
Faculty f=new Faculty();
System.out.println("Inforamation About Faculty:");
System.out.println("Enter Faculty Id:");
int fid=sc.nextInt();
f.setId(fid);

System.out.println("Enter Faculty Age:");
int fage=sc.nextInt();
f.setAge(fage);

System.out.println("Enter Faculty Name:");
String fname=sc.next();
f.setName(fname);

System.out.println("Enter Faculty Contact number:");
String fcontact=sc.next();
f.setContact(fcontact);

System.out.println("Enter Faculty Salary:");
float salary=sc.nextFloat();
f.setSalary(salary);

System.out.println("Enter Faculty subject name:");
String subject=sc.next();
f.setSubject(subject);

System.out.println("Faculty id:"+f.getId()+"\nFaculty Age:"+f.getAge()+"\nFaculty Name:"+f.getName()+"\nFaculty Contact Number:"+f.getContact()+"\nFaculty Salary:"+f.getSalary()+"\nFaculty Subject name:"+f.getSubject()+"\nCollage Name:"+Faculty.collageName);
f.pfcalculate();

Student s=new Student();
System.out.println("\nInformation About Student:");
System.out.println("Enter Student id:");
int sid=sc.nextInt();
s.setId(sid);

System.out.println("Enter Student Age:");
int sage=sc.nextInt();
s.setAge(sage);

System.out.println("Enter Student Name:");
String sname=sc.next();
s.setName(sname);

System.out.println("Enter Student contact number:");
String scontact=sc.next();
s.setContact(scontact);

System.out.println("Enter Student Percentage:");
int percent=sc.nextInt();
s.setPercent(percent);

System.out.println("Student id:"+s.getId()+"\nStudent Name:"+s.getName()+"\nStudent contact number:"+s.getContact()+"\nStudent Age:"+s.getAge()+"\nStudent percentage:"+s.getPercent()+"\nCollage name:"+Student.collageName+"\nStudent Grade:");
s.Grade();
	}
}