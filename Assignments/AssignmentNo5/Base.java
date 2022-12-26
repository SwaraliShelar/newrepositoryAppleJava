package AssignmentNo5;
/*4. Create a class with display() method that prints "This is parent class" and its 
subclass with another view() method that prints "This is child class". Now, 
create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
*/
public class Base
{
	void display()
	{
		System.out.println("this is parent class");
	}
}
//dont write public before Sub class(derived class) otherwise it give error because 
//The public type Derived must be defined in its own file
class Derived extends Base
{
void view()
{
	System.out.println("this is child class");
}
}

