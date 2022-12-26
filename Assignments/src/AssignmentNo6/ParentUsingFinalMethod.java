package AssignmentNo6;
//5. WAP to check whether final method of parent can be inherited in Child 
class Parent
{
	final void  show()
	{
		System.out.println("these is final method of parent class "+"\nyes, final method is inherited but you cannot override it");
	}
}
class Child extends Parent
{
    
}
public class ParentUsingFinalMethod
{

	public static void main(String[] args)
	{
    Child c= new Child();
    c.show();
	}

}
