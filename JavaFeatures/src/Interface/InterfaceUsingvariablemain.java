package Interface;
interface Calculator 
{
	//in interface variables are public,static and final by default
	int a=20;
	int b=10;
	
void addition();
void substraction();
void multiplication(int a,int b);
void division(int a,int b);
}

public class InterfaceUsingvariablemain implements Calculator
{
	//class can also implements new methods of class InterfaceUsingvariablemain at anywhere without declaring in interface 
		void power(double a,double b)
		{
			System.out.println("raised to the power of "+(Math.pow(a, b)));
		}
		void square(int s)
		{
			System.out.println("Square is:"+(s*s));
		}
		public void addition()
		{
			System.out.println("Addition is:"+(a+b));
		}
		public void substraction()
		{
			System.out.println("Substraction is:"+(a-b));
		}
		public void multiplication(int a,int b)
		{
			System.out.println("Multiplication is:"+(a*b));
		}
		public void division(int a,int b)
		{
			System.out.println("division is:"+(a/b));
		}
		void sqrt(int s)
		{
			System.out.println("square root is:"+Math.sqrt(s));
		}
		public static void main(String[] args) 
		{
			InterfaceUsingvariablemain iu= new  InterfaceUsingvariablemain();
			iu.power(2,2);
			iu.square(5);
			iu.addition();
			iu.substraction();
			iu.multiplication(4,3);
			iu.division(15,3);
			iu.sqrt(121);
		}
	}


