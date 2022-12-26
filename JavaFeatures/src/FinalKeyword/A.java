package FinalKeyword;

public class A {
final int a=100;
void display()
{
	System.out.println("parent class is "+a);
}
final void show()//final method cannot be overridden
{
	System.out.println("these is final method of parent class ");
}
}
class B extends A
{
	void display()
	{
		//we cannot change the value of final variable once the variable declares a final you can only use it
		// a=200;
		super.display();
		super.show();//but we can use final  method
		System.out.println("child class is "+a);
	}
	/*void show()//once a method of parent class declare as a final we cannot override this method in child class
	{
		
	}*/
}
