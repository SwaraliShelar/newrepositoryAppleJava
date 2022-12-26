package WrittenTest8;
/*Create an abstract class Machine with an implemented / concrete method rotate and an abstract method crush. Create a class Juicer which extends this abstract class Machine and implements method crush. Now, add another method filter in the class Juicer. In main method,
a. Create an object of type Juicer and calls its crush, rotate and filter methods.
b. Create an object of type Juicer with reference variable of Machine (Machine m = new Juicer). Check the methods available to m.
 */
abstract public class Machine
{
void rotate()//In Abstract machine class we can provides the method body to concrete methods
{
	System.out.println("In machine fruits are rotate to griend a juice");
}
abstract void crush();//In Abstract  class we cannot provide methods body to abstract methods provides the body to concrete methods 
}
class Juicer extends Machine
{
	public void crush()
	{
		System.out.println("In machine fruits are crused to make a juice");
	}
	void filter()
	{
		System.out.println("After rotating and crushing the fruits in machine juice is ready to filtering");
	}
}
	
