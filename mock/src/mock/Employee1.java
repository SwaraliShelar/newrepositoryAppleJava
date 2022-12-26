package mock;

public class Employee1 
{
	String name,dept;
	int salary;
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	void calulate()
	{
		System.out.println("salary cal:");
		float nsal=salary*0.5f;
		float pf=salary*0.15f;
		float totalsalary=nsal+pf;
		System.out.println(nsal+" "+pf);
		System.out.println(totalsalary);
	}
	
	public static void main(String args[])
	{
		Employee1 e=new Employee1();
		e.setId(1);
		e.setName("rajesh");
		e.setDept("finance");
		e.setSalary(300000);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
	    e.calulate();
	}
}