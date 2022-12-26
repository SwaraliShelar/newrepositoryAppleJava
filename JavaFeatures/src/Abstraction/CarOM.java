package Abstraction;

public class CarOM extends ObjectMovement1{
	
		public void move(int newspeed)
		{
			speed= newspeed;
			System.out.println("Now car is running with speed: "+speed+" km/hr on the road "+ObjectMovement1.direction+" direction");
		}
		public void carLoad(int a)
		{
			System.out.println(a+" weight Car can Carry");
		}
	}

