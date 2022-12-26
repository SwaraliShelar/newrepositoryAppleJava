package AssignmentInheritancePolymorphism;
/*6.Create interface Cake with a method declared as bake.
 *  Create 2 classes Strawberry, BlackForest both implementing Cake interface.*/
interface Cake
{
	void bake();//abstract method by default	
}
class Strawberry implements Cake
{
	public void bake()
	{
		System.out.println("we bake strawberry cake");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
	System.out.println("we bake BlackForest cake");
	}
}
public class CakeMain
{
	public static void main(String[] args)
	{
		  Cake b= new BlackForest();
		  b.bake();
          Cake s= new Strawberry();
          s.bake();
     
   

	}

}
