package WrittenTest6;

public class Person1 {
	private String name,addres;
	Address1 a;
Person1(String name,String addres,Address1 a)
{
 this.name=name;
 this.addres=addres;
 this.a=a;
}
public String toString()
{
	return "Name:"+name+"\nAddress:"+addres+"\n"+a;
}
}
