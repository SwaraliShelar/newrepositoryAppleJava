package Containment;

public class Car {
 int id,price;
 String name,color;
 Engine e;
/*//by using constructor
 Car(int id,int price,String name,String color,Engine e)
 {
	 this.id=id;
	 this.price=price;
	 this.name=name;
	 this.color=color;
	 this.e=e;
 }*/



 public void setEngine(Engine e)
 {
	this.e=e; 
 }
 public Engine getEngine()
 {
	 return e;
 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
 public String toString()
	{
	return "car id:"+id+"\ncar price:"+price+"\ncar name:"+name+"\ncar color:"+color;
	}	
}