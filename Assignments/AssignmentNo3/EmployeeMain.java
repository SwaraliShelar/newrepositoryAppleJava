package AssignmentNo3;

public class EmployeeMain {
public static void main(String[] args) {
	Employee emp1=new Employee();
	//System.out.println(emp1.id);
	emp1.setId(1);
	emp1.setSalary(45000);
	emp1.setName("pooja");
	emp1.setDept("Electronics");
	emp1.setContact("9876543210");
	
	//System.out.println(emp1.getId()+" "+emp1.getSalary()+" "+emp1.getName()+" "+emp1.getDept()+" "+emp1.getContact());
    System.out.println("employee id:"+emp1.getId());
	System.out.println("employee salary:"+emp1.getSalary());
	System.out.println("employee name:"+emp1.getName());
	System.out.println("employee department:"+emp1.getDept());
	System.out.println("employee contact number:"+emp1.getContact());
}
}
