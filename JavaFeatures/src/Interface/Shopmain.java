package Interface;
interface Cake
{
	int price=250;//public,static,final
	void  preparing();
	static void showMenu()//default method contains a body after java 8 version
	{
		System.out.println("Mutiple flavors are available in cake with price:"+price);
	}
	default void display()//static method contains a body after java 8 version
	{
		System.out.println("Mango,pinnaple,strawberry");
	}
}
interface IceCream
{
	void  preparing();
}
class Shop implements Cake,IceCream
{

	@Override
	public void preparing() 
	{
		System.out.println("These method preaparing is for both cake and icecream");
	}
	public void display()
	{
		Cake.super.display();
		System.out.println("we overridde the  display method here");
	}	
	
}

public class Shopmain 
{
public static void main(String[] args) 
{
	Shop s= new Shop();
	
	Cake.showMenu();
	s.display();
	s.preparing();
}
}
