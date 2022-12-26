package AssignmentContainment;

public class Student1 {
	private int roll;
	private String name ;
	Department1 d1;
	Student1( int roll,String name,Department1 d1)
	{
		this.roll=roll;
		this.name=name;
		this.d1=d1;
	}
	public String toString()
	{
		return "Student RollNo:"+roll+"\nStudent Name:"+name+"\n"+d1;
	}
}