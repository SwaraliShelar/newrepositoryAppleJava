package ArrayObject;

public class Department
{
int id,empNo;
String name;
Department(int id,int empNo,String name)
{
	this.id=id;
	this.empNo=empNo;
	this.name=name;
}
public String toString()
{
	return"id:"+id+"   EmpNo:"+empNo+"   Name:"+name;
}
}
