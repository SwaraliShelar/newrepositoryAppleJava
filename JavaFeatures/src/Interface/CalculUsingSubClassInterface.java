package Interface;
interface CalArea1
{
int h=4,l=2,s=5,w=3;
void circle(int r);
void rectangle();
void triangle(int b);
}
interface  CalArea2
{
void Box(int w);
void square();
}
class Area implements CalArea1
{
	public void circle(int r)
	{
		System.out.println("Area of circle:"+(3.14*r*r));
	}
	public void rectangle()
	{
		System.out.println("Area of Rectangle:"+(l*w));
	}
	public void triangle(int b)
	{
		System.out.println("Area of Triangle:"+(0.5f*b*h));
	}	
}
class Area1 extends Area implements CalArea1,CalArea2
{
	public void Box(int w)
	{
	System.out.println("Area of Box:"+(2*l*w+2*l*h+2*h*w));	
	}
	public void square()
	{
	System.out.println("Area of square:"+(s*s));
	}
	public void circle(int k)
	{
		super.circle(l);
		System.out.println("\nwe can also override a method in parent class and here we calculate \nArea of circle:"+(3.14*l*l));
	}
	
}
public class CalculUsingSubClassInterface 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     /*  Area a= new Area();
       a.circle(2);
       a.rectangle();
       a.triangle(6);*/
		Area1 a1=new Area1();
		a1.Box(3);
		a1.circle(2);
		a1.rectangle();
		a1.square();
		a1.triangle(7);
      
	}

}
