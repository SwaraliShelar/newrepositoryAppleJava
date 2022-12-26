package AssignmentInheritancePolymorphism;

public class CarVehicleMain {
public static void main(String[] args) {
	Car c=new Car();
	c.setName("audi");
	c.setColour("White");
	c.setPrice(46000000);
	c.wheels();
	c.headLight();
	c.displayCar();
}
}
