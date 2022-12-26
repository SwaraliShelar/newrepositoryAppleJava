package Interface;
interface C
{
   void add(int a,int b);
   void sqrt(int a);
}
interface D
{
	void square (int a);
	void sqrt(int a);
}
	public class MultiplemainCD implements C,D 
	{

		public void add(int a,int b)
		{
			System.out.println("Addition:"+(a+b));
		}
		public void sqrt(int a)
		{
			System.out.println("Square root:"+ Math.sqrt(a));
		}

		public void square(int a)
		{
			System.out.println("Square:"+(a*a));
		}

		public static void main(String[] args) {

			MultiplemainCD m = new MultiplemainCD();
			m.add(5, 10);
			m.sqrt(25);
			m.square(4);
		}

}
