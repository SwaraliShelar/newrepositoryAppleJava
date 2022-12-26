package AssignmentNo5;

public class Square extends Rectangle 
{
int side;
Square(int side)
{
	//this.side=side;//error
	super(side,side);//super(2,6);
	this.side=side;
}
void area()
{
	super.area();
	float a=3.14f*side*side;
	System.out.println("area of Square:"+a);
}
void perimeter()
{
	super.perimeter();
	float  p=4*side;
	System.out.println("Perimeter of Square:"+p);

}
}
