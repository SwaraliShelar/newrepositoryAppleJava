package Abstraction;
//if Swift1 is child  class doesnt want to override any abstract method of car1 parent class like, abstract void alloyWheels();
//then declare  your child Swift1 class as a abstract class and 
//then declare SwiftDezire1 as new child class of Swift1 abstract parent class and then override that car1 abstract method abstract void alloyWheels(); in SwiftDezire1 child class

public class SwiftDezire1 extends Swift1
{
void alloyWheels()
{
	System.out.println("Swift dezire have alloywheels");
	
}
}
