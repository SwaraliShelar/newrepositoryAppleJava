package AssignmentNo6;
	//1. What is the output of following code
	class Base {
	 public final void show() 
	 {
	 System.out.println("Base::show() called");
	 }
	}
	class Derived extends Base
	{
	 public void show1() 
	 {
	 System.out.println("Derived::show() called");
	 }
	}