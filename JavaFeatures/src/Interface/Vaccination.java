package Interface;

public class Vaccination implements Project 
{
	
public void requirements()
{
	System.out.println("data should be secured");
}
public void planning()
{
	System.out.println("provids vaccination to all villages,cities all overarea of country");
}
public void designing()
{
	System.out.println("information provided is ready to design");
}
public void development()
{
	System.out.println("information provided is ready to development ");
}
public void testing()
{
	System.out.println("information provided is ready or testing ");
}
public void deployment()
{
	System.out.println("the vaccinations are ready to go in market");
}
public void maintaince()
{
	System.out.println("100% goal of vaccination");
}
public void newChanges()//we also overridden these method with increase the accessability level default to public
{
	System.out.println("default scope changes increse after overridden from Default to public");
}
//we cannot  overridden these static method because in provides the security 
//Java interface static method helps us in providing security by not allowing implementation classes to override them
static void methodStatic()
{
	System.out.println("we cannot override these method "+"\n"+"these is own static method of the implemented class");
	
}
}
