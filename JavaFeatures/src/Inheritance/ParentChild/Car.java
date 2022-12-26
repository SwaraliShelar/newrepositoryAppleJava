package Inheritance.ParentChild;
//multilevel inheritance example
//Grandparent class
public class Car {
String Price,engine;

public String getPrice() {
	return Price;
}

public void setPrice(String price) {
	Price = price;
}

public String getEngine() {
	return engine;
}

public void setEngine(String engine) {
	this.engine = engine;
}
void wheelNo()
{
	System.out.println("4 wheelers");
}
void headLights()
{
	System.out.println("2 headlights");
}
}
