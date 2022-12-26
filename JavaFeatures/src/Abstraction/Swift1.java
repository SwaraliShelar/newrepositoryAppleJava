package Abstraction;
//if Swift1 is child  class doesnt want to override any abstract method of car1 parent class like, abstract void alloyWheels();
//then declare  your child Swift1 class as a abstract class and 
//then declare SwiftDezire1 as new child class of Swift1 abstract parent class and then override that car1 abstract method abstract void alloyWheels(); in SwiftDezire1 child class
public  abstract class Swift1 extends Car1
{
	void setValue(String engine,int price)
	{
		this.engine=engine;
		this.price=price;
	}
	void display()
	{
		System.out.println("Engine:"+engine+"\nPrice:"+price);
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
