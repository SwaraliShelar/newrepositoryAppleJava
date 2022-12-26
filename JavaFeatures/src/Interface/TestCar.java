package Interface;

interface TestCar
{
	
  void milage(int power);
  void crashTest();
  void speedTest(float speed);
  void breakTest();
  void loadTesting(String weight);
}
class Swift implements TestCar
{
	public void milage(int power)
	{
		System.out.println("every Car has milage test before selling milage:"+power);
	}
	public void crashTest()
	{
		System.out.println("check if there is any crash on car");
	}
	void seatWormer()//this is swift cars own method with is implementation thats why public is not used
	{
	System.out.println("swift car have a seat warmer");
	}
	public void speedTest(float speed)
	{
		System.out.println("speed is:"+speed);
	}
	public void breakTest()
	{
		System.out.println("car should have break");
	}
	void dashboard()//this is swift cars own method with is implementation thats why public is not used
	{
		System.out.println("Swift car have a music system,wippers etc");
	}
	public void loadTesting(String weight)
	{
		System.out.println("how many peopless wait car should carry:"+weight);
	}
}
