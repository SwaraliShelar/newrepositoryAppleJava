package Abstraction;

public class Swift extends Car
{
	void setValue(String engine,int price)
	{
		this.engine=engine;
		this.price=price;
	}
	void display()
	{
		System.out.println(engine+" "+price);
	}
	void dashBoard()
	{
		System.out.println("Swift Car has a:music system,AC,Screen");
	}
	void safetyFeatures()
	{
		System.out.println("Swift provides advance safety features:child lock,airbag");
	}
	void buildQuality()
	{
		System.out.println("Swift Car is 3 star rated");
	}
}
