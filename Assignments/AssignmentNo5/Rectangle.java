/*6. Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the rectangle 
respectively. Its constructor having parameters for length and breadth is 
used to initialize length and breadth of the rectangle. Let class 'Square' 
inherit the 'Rectangle' class with its constructor having a parameter for its 
side (suppose s) calling the constructor of its parent class as 'super(s,s)'. 
Print the area and perimeter of a rectangle and a square.
 */
package AssignmentNo5;

public class Rectangle 
{
	int lenght,breadth;
	Rectangle(int lenght,int breadth)
	{
		this.lenght=lenght;
		this.breadth=breadth;
	}
void area()
{
	float area=lenght*breadth;
	System.out.println("area of Rectangle:"+area);
}
void perimeter()
{
	float  perimeter=2*(lenght+breadth);
	System.out.println("Perimeter of Rectangle:"+perimeter);

}
}
