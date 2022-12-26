package Abstraction;

public abstract class Car1 
{
	String engine;
	int price;
Car1()
{
engine="100000 cc engine";	
price=50000000;
}
void wheelNo()//concrete method
{
	System.out.println("Every car has 2 wheels");
}
void headLight()//concrete method
{
	System.out.println("Every car have 2 headlights");
}
abstract void dashBoard();//abstract method
abstract void safetyFeatures();//abstract method
abstract void buildQuality();//abstract method
abstract void alloyWheels();
}
