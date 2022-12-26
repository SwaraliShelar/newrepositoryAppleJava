package Containment;

public class Car2 {
	private  int id,price;
	private String name,color;
	Driver2 d;
	Car2(int id,int price,String name,String color,Driver2 d)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.color=color;
		this.d=d;
	}
	public String toString()
	{
		return "Car id:"+id+"\nCar price:"+price+"\nCar name:"+name+"\nCar color:"+color+"\n"+d;
	}
}
