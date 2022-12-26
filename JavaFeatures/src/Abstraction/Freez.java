package Abstraction;

public class Freez extends Electronics
{
	Freez(String color,float price,float weight)
	{
		this.color=color;
		this.price=price;
		this.weight=weight;
	}
	void display()
	{
		System.out.println("color:"+color+"\nPrice:"+price+"\nWeight:"+weight);
	}
	void rating()
	{
		System.out.println("freez has a 5 star rating");
	}
	void features()
	{
		System.out.println("freez has a cooler power");
	}
	void electricityConsumption()
	{
		System.out.println("It consume less elctricity");
	}
}
