package Interface;
interface A 
{
	void addition(int a, int b);
}

interface B
{
	void square(int s);
}

class AB implements A,B {

	public void addition(int a, int b) {
		System.out.println("Addition is:" + (a + b));
	}

	public void square(int s) {
		System.out.println("square is:" + (s * s));
	}
}

	
class MultipleABmain 
{
		public static void main(String[] args)
		{
				AB obj = new AB();
				obj.addition(10, 20);
				obj.square(2);
		}

}



