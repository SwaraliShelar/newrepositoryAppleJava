package Abstraction;

public class ObjectBallCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			CarOM co=new CarOM();
			co.setSpeed(300);
			co.move(100);
			co.carLoad(250);
			System.out.println("Initial speed of car: "+co.getSpeed()+" km/hr");
			
			Ball b= new Ball();
			b.setSpeed(90);
			b.move(76);
			b.showColor();
			System.out.println("Initial speed of ball: "+b.getSpeed()+" meter/minut");
			/*
			//these is the example of abstraction but in these we can use reference of abstract class to call the subclasses car and ball
			  
		    ObjectMovement1 om2;
			om2=new CarOM(); //we use upcasting to call the methods
			om2.setSpeed(300);
			//om2.carLoad(250);//we cannot call these method by using om2 because it not abstract  method
			om2.move(100);
	         //  but using reference variable of abstract class we only call abstract methods		
			
			System.out.println("Initial speed of car: "+om2.getSpeed()+" km/hr");
			
			om2=new Ball();
			om2.move(76);
			Ball b;
			//om2.showColor();//we cannot call these method by using om2 because it not abstract  method
			om2.setSpeed(90);
			System.out.println("Initial speed of ball: "+om2.getSpeed()+" meter/minut");	*/	
	}

}
