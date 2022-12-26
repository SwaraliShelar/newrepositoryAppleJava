package Assignment5ByConstructor;

public class Student {
	int rollno;
	String name;
	Department d;
Student(int rollno,String name,Department d)
{
	this.rollno=rollno;
	this.name=name;
	this.d=d;
}
public String toString()
{
	return "Student rollno:"+rollno+"\nStudent name:"+name+"\nDepartment:"+d;
}
}
