package DynamicMethoDispatchOverridingExample;

public class Fruit {
void Taste()
{
	System.out.println("fruit taste is sweet");
}
}
class Apple extends Fruit
{
void Taste()
	{
	System.out.println("Apple is sweet");
	}
}
class Strawberry extends Fruit
{
	void Taste()
	{
		System.out.println("Strawberry is sweet and sour");
	}
}
