/*11.Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters. The 
method for printing area of rectangle has two parameters which are length 
and breadth respectively while the other method for printing area of 
square has one parameter which is side of square.

 */
package AssignmentNo4;

public class Area {
void area(int s)
{
	System.out.println("area of square:"+(s*s));
}
void area(int l,int b)
{
	System.out.println("area of rectangle:"+(l*b));
}
public static void main(String[] args) {
	Area a1=new Area();
	a1.area(3);
	a1.area(5,6);
	
}
}
