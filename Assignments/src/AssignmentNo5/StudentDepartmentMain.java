package AssignmentNo5;

public class StudentDepartmentMain
{
public static void main(String[] args)
{
	
	Department d1=new Department();
	d1.setDept_id(7);
	d1.setDept_name("BCS");
	
	Student s1=new Student();
	s1.setRollno(30);
	s1.setName("pooja");
	s1.setDepartment(d1);
	
	System.out.println(s1);
	
	
}
}
