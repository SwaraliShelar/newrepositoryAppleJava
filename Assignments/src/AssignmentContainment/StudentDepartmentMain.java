package AssignmentContainment;

public class StudentDepartmentMain 
{
	public static void main(String[] args) {
		
Department d1=new Department();	
d1.setId(1);
d1.setName("Biology");

Student s1=new Student();
s1.setRoll(11);
s1.setName("pooja");
s1.setDepartment(d1);

System.out.println("Information about Student and Department:");
System.out.println("Student RollNo:"+s1.getRoll()+"\nStudent Name:"+s1.getName()+"\n"+d1);
}
}