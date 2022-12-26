package AssignmentInheritancePolymorphism;

public class Rectangl extends Triangle {
	int area,w;
	void setRectangleValue(int w)
	{
		this.w=w;
	}
    void getRectangleValue()
    {
    	area=b*w;
   	 System.out.println("Area of Rectagle is:"+area);
    }
}
