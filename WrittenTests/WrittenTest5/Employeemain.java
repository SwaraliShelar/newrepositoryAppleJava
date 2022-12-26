package WrittenTest5;

public class Employeemain
{
	public static void main(String[] args) 
	{
		Employee  emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("swara");
		emp1.setSalary(10000.00f);
		emp1.display();
		System.out.println();
		Employee  emp2 = new Employee(2,"pooja",7000.00f);
		emp2.display();

	}
}
