package WrittenTest7;

public class EmploProgrSingleInheitance 
{
public static void main(String[] args) {
	Programmer p=new Programmer();
	p.setBonus(200.00f);
	p.setSalary(4000.00f);
	p.display();
	System.out.println("Salary After Adding  Bonus is:"+p.totalSalary);
	//System.out.println("Salary After Adding  Bonus is:"+p.totalSalary(200.00f,4000.00f));

}
}
