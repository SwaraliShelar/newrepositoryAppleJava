package AssignmentInheritancePolymorphism;

public class TriangleRectaglCircleMultilevelMain {
public static void main(String[] args) {
	Circle c=new Circle();
	c.setTriangleValue(2, 5);
	c.setRectangleValue(4);
	//c.setCircleValue();


	c.getTriangleValue();   //0.5*b*h=0.5*2*5
	c.getRectangleValue(); //b*w=2*4
	c.getCircleArea();    //3.14*w*w=3.14*4*4
}
}
