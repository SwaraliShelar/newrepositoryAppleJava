package AssignmentInheritancePolymorphism;

public class Programmer extends Employee
{
float bonus;
public float getBonus() {
	return bonus;
}
public void setBonus(float bonus) {
	this.bonus = bonus;
}
public static void main(String[] args) 
{
Programmer p=new Programmer();
}
float totalSalary;
void calculation()
{
	totalSalary=bonus+salary;
}
void display()
{
	calculation();
	System.out.println("Employee Salary:"+salary);
	System.out.println("Programmer Bonus:"+bonus);
}
/*public float totalSalary(float salary,float bonus)
{
	return salary+bonus;
}
*/
}
