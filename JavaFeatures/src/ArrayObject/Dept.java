package ArrayObject;
//24. Same as above but print Employees whose dept_name is same. 
public class Dept {
int did;
String dname;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String toString()
{
	return "Department Id:"+did+"  Department Name:"+dname;
}
}
