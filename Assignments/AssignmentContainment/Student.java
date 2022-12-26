package AssignmentContainment;

public class Student {
	private int roll;
	private String name ;
	Department d;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(Department d)
	{
		this.d=d;
	}
	public Department getDepartment()
	{
		return d;
	}
}
