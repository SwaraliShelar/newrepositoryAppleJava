package AssignmentNo6;
/*4. Create a class Demo. In class Demo, declare a member
variable x of type int as final.
In main method -
a. Create an object of type Demo. Try to change the value of x.
b. Now declare and implement a method display and
make it final. Create a class DemoChild which
extends Demo. In DemoChild, try to override the
method display.
c. Now declare the class DemoChild as final
and try to extend the class DemoChild.
 */


class Demo 
{
  final int x=30;
  final void display()
  {
	  System.out.println("these is a final method of class Demo");

  }
}
/*final class DemoChild extends Demo
{
	public void display()
	{
		System.out.println(x=10);
	}
}
/*class DemoChild1 extends DemoChild2
{
	
}*/
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d= new Demo();
		d.display();
		System.out.println("We cant override the value of final varible x and final method displaywe only access  that final value and methods by using object");
		System.out.println("Try to change the value of x:\n"+d.x+" these is the the value of x before change");
        System.out.println("We cant extend or override the values of default variable,class,method");
	}

}
