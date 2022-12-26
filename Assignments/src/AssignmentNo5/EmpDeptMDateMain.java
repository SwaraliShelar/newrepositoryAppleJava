package AssignmentNo5;

public class EmpDeptMDateMain
{
public static void main(String[] args) {
	
	Dept d1=new Dept();
	d1.setDept_id(111);
	d1.setDept_name("finance");
		
	Mdate m1=new Mdate();
	m1.setDay("monday");
	m1.setMonth(11);
	m1.setYear(2022);
	
	Employee e1=new Employee();
	e1.setId(1);
	e1.setName("mr goinka");
	e1.setSalary(50000.00f);
	e1.setDept(d1);
	e1.setMdate(m1);
	
	

	System.out.println("Information about Employee:");
	System.out.println("Employee Id:"+e1.getId()+"\nEmployee name:"+e1.getName()+"\nEmployee Salary:"+e1.getSalary());

	System.out.println("Information about Employee Deptartment:");
	//System.out.println("Employee Dept_id:"+d1.getDept_id()+"\nEmployee Dept_name:"+d1.getDept_name());
	System.out.println(e1.getDept());
	
	System.out.println("Information about day,month year:");
	//System.out.println("Day:"+m1.getDay()+"\nMonth:"+m1.getMonth()+"\nYear:"+m1.getYear());
	System.out.println(e1.getMdate());
	
}
}
