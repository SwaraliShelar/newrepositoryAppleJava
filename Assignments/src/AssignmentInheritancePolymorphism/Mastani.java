package AssignmentInheritancePolymorphism;
/*Create interface IceCream with method eat and Juice with method drink. 
Create class Mastani which implements both interfaces.*/
interface IceCream
{
	void eat();//by default public and abstract
}
interface Juice
{
	void drink();//by default public and abstract
}
public class Mastani implements IceCream,Juice
{
   public void eat()
   {
	   System.out.println("mango flavor iceream  is very tasty & thats why i am eating a icecream");
   }
   public void drink()
   {
	   System.out.println("Sugarcane juice is very good for health");
   }
	public static void main(String[] args) 
	{
   /* Mastani m= new Mastani();
    m.eat();
    m.drink();*/
    IceCream i=new Mastani();//upcasting
    i.eat();
    
    Juice j=new Mastani();//upcasting
    j.drink();
	}
}
