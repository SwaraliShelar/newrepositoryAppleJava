package Assignment5ByConstructor;

public class EmpDeptMDateMain
{
public static void main(String[] args) {
	//using constructor
	Dept d2=new Dept(222,"economics");
	Mdate m2=new Mdate("sunday",3,2020);
	Employee e2=new Employee(11,"rahul",40000.00f,d2,m2);
	System.out.println(e2);
}
}
