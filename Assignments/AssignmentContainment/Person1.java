package AssignmentContainment;

public class Person1 {
	private String name, gender, age;
	Address1 a1;
	Person1(String name,String gender,String age,Address1 a1)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.a1=a1;
	}
	public String toString()
	{
		return "Name:"+name+"\nGender:"+gender+"\nAge:"+age+"\n"+a1;
	}
}
