package Containment;
//example of composition
public class Car1 {
private  int id,price;
private String name,color;
Driver d;
Car1(int id,int price,String name,String color,int did,int contact,String dname)
{
	this.id=id;
	this.price=price;
	this.name=name;
	this.color=color;
	
	//example of composition
	//create object of driver class
	d=new Driver( did,contact, dname);
}
	public String toString()
	{
		return "car id:"+id+"\ncar price:"+price+"\ncar color:"+color+"\n"+d;
	}
}
