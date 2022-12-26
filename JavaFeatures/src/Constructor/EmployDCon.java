package Constructor;

public class EmployDCon {
	int id,salary;
	String name,dept;
	float pf;
	EmployDCon()//use define default constructor 
	{
		id=1;
		salary=40000;
		name="satish";
		dept="economics";
		pf=0.6f;
	}
	void display()
	{
		System.out.println(id+" "+salary+" "+name+" "+dept+" "+pf);
	}
public static void main(String[] args) 
{
	EmployDCon emp1=new EmployDCon();
	EmployDCon emp2=new EmployDCon();

	emp1.display();
	System.out.println("-------------------------");
	emp1.display();

	
}
}
