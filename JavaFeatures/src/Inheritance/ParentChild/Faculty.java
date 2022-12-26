package Inheritance.ParentChild;

public class Faculty extends CollagePerson {
	float salary;
	String subject;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	void pfcalculate() 
	{
		float pf=salary*0.15f;
		System.out.println("Calculated pf is:"+pf);
	}
}
