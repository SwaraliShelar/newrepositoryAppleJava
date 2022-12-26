package Polymorphism;

public class Shape {
void area(int a)
{
	System.out.println("area of square:"+(a*a));
}
void area(float r)
{
	System.out.println("area of circle:"+(3.14*r*r));
}
void area(float b,float h )
{
	System.out.println("area of triangle:"+(0.5*b*h));
}
void area(int l,int w)
{
	System.out.println("area of rectangle:"+(l*w));
}
public static void main(String[] args) {
	Shape s1=new Shape();
	s1.area(2.0f);
	s1.area(4);
}
}
