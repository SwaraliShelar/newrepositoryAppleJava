package AssignmentContainment;

public class EmployeeDeptMydate 
{
public static void main(String[] args) {
	Mydate m1=new Mydate();
	m1.setDay("Monday");
	m1.setMonth("may");
	m1.setYear("2022");
	
	Dept d1=new Dept();
	d1.setDept_id(1);
	d1.setDept_name("Economics");
	
	Employee e1=new Employee();
	e1.setId(111);
	e1.setName("mr patil");
	e1.setSalary(45000.00f);
	e1.setDept(d1);
	e1.setMydate(m1);
	System.out.println("Information about Employee:");
	System.out.println("Employee Id:"+e1.getId()+"\nEmployee Name:"+e1.getName()+"\nEmplyee Salary:"+e1.getSalary()+"\n"+d1+"\n"+m1);
}
}
