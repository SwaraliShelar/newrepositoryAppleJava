package Overriding;
//multilevel inheritance by using method overloading
public class Father extends GrandFather
{
	String fathern;

public void setFathern(String fathern) 
{
	this.fathern = fathern;
}
void display()
{
	super.display();
	System.out.println();
	System.out.println("Fathres full name:"+fathern+" "+super.firstn+" "+Father.lastn);
}
}
