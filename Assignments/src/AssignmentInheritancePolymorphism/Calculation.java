package AssignmentInheritancePolymorphism;

public class Calculation extends AddSubMulDiv
{
 void display()
 {
	 System.out.println("Addition is:"+addition(20,60));
	 System.out.println("substraction is:"+substraction(50,10));
	 System.out.println("Multiplication is:"+multiplication(10,10));
	 System.out.println("Division is:"+division(20,2));
 }


 public static void main(String[] args)
{
	Calculation c=new Calculation();
	c.display();
}
}