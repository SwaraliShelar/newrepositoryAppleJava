package InheritanceUsingConstructor;

class A
{
	A()
	{
		System.out.println("Inside a Class A default Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Inside a Class B default Constructor");
	}
	B(int a)
	{
		//super();  //A
		System.out.println("Inside a class B parameterised constructor");
	}
}
class C extends B
{
	C()
	{
		super(10);//represent immediate parent B class
		System.out.println("Inside a Class C default Constructor");
	}
}
public class ConstructorMain {
 public static void main(String[] args) 
 {
	 //parent class default constructor get call first
	 //if we parameterized constructor then it well get call first 
	 //but we have to represent super(parameterized value);
	 //here parameterized call because in class C in Constructor C() we write a super(10);
	 //thats why it immediately represent value of Constructor B()
	C c1 = new C();
	/*Note: Here first super (child) class constructor will be
    called there after derived(sub class) constructor
    will be called*/

 }
}
