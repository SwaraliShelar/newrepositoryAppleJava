package AssignmentInheritancePolymorphism;

public class Triangle
{
	int b,h;
	float area;
void setTriangleValue(int b,int h)
{
	this.b=b;
	this.h=h;
}
void getTriangleValue()
{
	 area=0.5f*b*h;
	 System.out.println("Area of Triagle is:"+area);
}
}
