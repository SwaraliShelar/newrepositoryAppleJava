package Overriding;

public class Child extends Father
{
String childn;

public void setChildn(String childn)
{
	this.childn=childn;
}
void display()
{
	super.display();
	System.out.println();
	System.out.println("Child full name:"+childn+" "+super.fathern+" "+Child.lastn);
}
}
