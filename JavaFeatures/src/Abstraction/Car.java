                                                                                                                                                                                                                                                                                          package Abstraction;
//abstract method and class is create by using abstract keyword
public abstract class Car// cannot create object of abstract class
{
	//constructor are allowed abstract class
	String engine;
	int price;
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
}
