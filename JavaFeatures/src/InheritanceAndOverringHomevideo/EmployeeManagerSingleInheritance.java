package InheritanceAndOverringHomevideo;

public class EmployeeManagerSingleInheritance 
{
	public static void main(String[] args) {
		
Manager m=new Manager();
m.acceptEmployeeDetails("mr bajaj",101,20000);
m.setIncentive(1000.00f);
m.displayManagerDetails();
}
}