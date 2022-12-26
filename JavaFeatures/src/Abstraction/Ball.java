package Abstraction;


	class Ball extends ObjectMovement1
	{
		public void move(int newspeed)
		{
			speed=newspeed;
			System.out.println("Now ball is rolling with the speed: "+speed+" meter/minut ground in "+ObjectMovement1.direction+" direction");
		}
		public void showColor()
		{
			System.out.println("Ball color is white");
		}
	}

