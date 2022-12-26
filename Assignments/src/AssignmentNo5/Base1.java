/*5. In the above example, declare the method of the parent class as private 
and then repeat the first two operations (You will get error in the third).
 */
package AssignmentNo5;

//private class Base1 otherwise it gives error because
//Illegal modifier for the class Base; only public, abstract & final are permitted

 class Base1
	{
		void display()
		{
			System.out.println("this is parent class");
		}
	}
class Derived1 extends Base1
{
void view()
{
	System.out.println("this is child class");
}
}

