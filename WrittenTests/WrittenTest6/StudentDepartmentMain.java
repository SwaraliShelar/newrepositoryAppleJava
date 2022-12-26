package WrittenTest6;

public class StudentDepartmentMain 
{
	public static void main(String[] args) {
	
	Department d1=new Department();
	d1.setId(1);
	d1.setDname("Economics");
	
Student s1=new Student();
s1.setRoll(28);
s1.setName("Pooja shelar");
s1.setDepartment(d1);

System.out.println("Student RollNo:"+s1.getRoll()+"\nStudent Name:"+s1.getName()+"\n"+d1);
}
}