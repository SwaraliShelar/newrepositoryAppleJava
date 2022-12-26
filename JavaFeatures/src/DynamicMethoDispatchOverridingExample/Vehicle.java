package DynamicMethoDispatchOverridingExample;

public class Vehicle
{
	void move()
	{
		System.out.println("vehicle is moving");
	}
}

class Car extends Vehicle
{
	void move() 
	{
		super.move();
		System.out.println("car is vehicle and its move horizontally on the road");
	}
}

class Helicopter extends Vehicle
{
	void move()
	{
		System.out.println("Helicopter is Vehicle and its move vertically in the air");
	}
}
