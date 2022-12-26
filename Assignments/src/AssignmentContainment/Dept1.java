package AssignmentContainment;

public class Dept1 {
	private int dept_id;
	private String dept_name;
	Dept1(int dept_id,String dept_name)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
	public String toString()
	{
		return "Department id:"+dept_id+"\nDepartment name:"+dept_name;
	}
}
