package Interface;
interface Calci
{
	int a=5;//final
	int b=3;//final
	double angle=50;//final
	int add(int a ,int b);//by default public, static,final
	int sub(int a,int b);
}
interface ScientificCalci extends  Calci
{
	double findsin(double angle);//these abstract method doent provide a body
	double findtan(double angle);
	
	//backword capatibilty
	default double findsqrt(double x)//these abstract default method provide a body
	{
		return Math.sqrt(x);
	}
	static double findpow(int a,int b)
	{
		return Math.pow(a, b);
	}
	
}
public class MathsLab implements Calci,ScientificCalci
{
    public int add(int a,int b)
    {
    	return a+b;
    }
    public int sub(int a,int b)
    {
    	return a-b;
    }
    public double findsin(double angle)
    {
    	return Math.sin(angle);
    }
    public double findtan(double angle)
    {
    	return Math.tan(angle);
    }
    public double findsqrt(double x)
    {
    System.out.println("these is overridden method sqrt version");
    	return Math.sqrt(x);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     MathsLab lb=new   MathsLab();
     System.out.println("Additon of "+a+" and "+ b+" is: "+lb.add(a, b));
     System.out.println("Substraction of "+a+" and "+ b+" is: "+lb.sub(a, b));
     System.out.println("sin of angle "+angle+" is: "+lb.findsin(angle));
     System.out.println("tan of angle "+angle+" is: "+lb.findtan(angle));
     System.out.println("Square root of "+a+" is: "+lb.findsqrt(625));
	}

}
