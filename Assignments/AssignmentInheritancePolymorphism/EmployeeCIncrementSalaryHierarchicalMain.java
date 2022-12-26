package AssignmentInheritancePolymorphism;

public class EmployeeCIncrementSalaryHierarchicalMain 
{
public static void main(String[] args) {
	FulltimeEmployeeC f=new FulltimeEmployeeC();
	f.display();
	f.fullEmployeeIncreament(5000.00f);
	
	PartTimeEmployeeC p=new PartTimeEmployeeC();
    p.PartTimeEmployeeIncreament(2000.00f);	
    
	InternEmployeeC i=new InternEmployeeC();
	i.InternEmployeeCIncreament(1000.00f);
}
}
