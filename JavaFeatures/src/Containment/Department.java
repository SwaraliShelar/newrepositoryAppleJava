package Containment;

public class Department {
	private int dept_id;
	private String dept_name;
	Faculty f;

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public void setFaculty(Faculty f) {
		this.f = f;
	}

	public Faculty getfaculty() {
		return f = f;
	}
	public String toString()
	{
		return "\nDepartment id:"+dept_id+"\nDepartment name:"+dept_name+"\n"+f;
	}
}
