package DynamicMethoDispatchOverridingExample;

public class FruitMainDynamicMethodDispatch {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.Taste();
		
		f=new Apple();//upcating
		f.Taste();
		
		f=new Strawberry();
		f.Taste();
		
		/*Apple a=new Fruit();//downcasting its not allowed in java
		a.Taste();*/
	}
}
