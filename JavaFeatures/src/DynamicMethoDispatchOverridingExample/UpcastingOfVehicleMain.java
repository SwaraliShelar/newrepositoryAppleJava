package DynamicMethoDispatchOverridingExample;

public class UpcastingOfVehicleMain {
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	//Vehicle v is static type 
	//new car is dynamic types and new helicopter is dynamic type 
	//v is the reference variable of parent class and he decides which move method to call
	v=new Car();
	v.move();
	v=new Helicopter();
	v.move();
}
}
