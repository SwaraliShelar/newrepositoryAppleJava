
public class EmployeeMain 
{	
public static void main(String[] args)
{
	
	EmployeeCrudOperation elm=new EmployeeCrudOperation();
	elm.mainArray();
	elm.displayEmployeeData();
	elm.addEmployee();
	elm.displayEmployeeData();
	elm.updateEmployee();
	elm.searchEmployee();
	elm.deleteEmployee();
	
}
}