package Assignment5ByConstructor;

public class StudentDepartmentMain 
{
public static void main(String[] args)
{
	Department d1=new Department(101,"science");
	Student s1=new Student(1,"pooja",d1);
	System.out.println(s1);
}
}
