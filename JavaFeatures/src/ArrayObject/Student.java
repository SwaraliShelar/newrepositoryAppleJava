package ArrayObject;

public class Student
{
	int id,marks;
	String name,dept;
	//we can also use getter setter method here
Student(int id,int marks,String name,String dept)
{
	this.id=id;
	this.marks=marks;
	this.name=name;
	this.dept=dept;
}
	
    public String toString()
    {
    	return id+"  "+marks+"  "+name+"  "+dept;
    }
	}


