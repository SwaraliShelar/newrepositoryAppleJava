package Interface;
interface Movable
{  
	String direction="Forword";//all  variables in interface are by default public,static,final
	void move(int speed);//methods are abstract by default
	void show();//methods are abstract by default
}
interface Washable
{
	void wash();
}
class Car implements Movable,Washable
{
	public void move(int speed)
	{
		System.out.println("Car is running in "+speed+" speed km/hour in road in "+Movable.direction+" direction");
	}
	public void show()
	{
		System.out.println("these is wagenar runs on CNG");
	}
	public void wash()
	{
		System.out.println("Car washed during survicing");
	}
}
class Ball1 implements Movable
{
	public void move(int speed)
	{
		System.out.println("ball is rooling with speed "+speed+" meter/minut on the ground in "+Movable.direction+" direction");
	}
	public void show()
	{
		System.out.println("ball color is red");
	}	
}
public class InterfaceVideoExmaple 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Movable m;
		
		m=new Ball1();
		m.move(67);
		m.show();
		
		m=new Car();
		m.move(150);
		m.show();
				
		Washable w;
		w=new Car();
		w.wash();
		
	    
  /*  Car c=new Car();
    c.move(100);
    c.show();
    c.wash();
    
    Ball b=new Ball();
    b.move(19);
    b.show();*/
	}

}
