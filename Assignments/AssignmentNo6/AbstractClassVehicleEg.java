package AssignmentNo6;

abstract class Vehicle {
	abstract void start();

	abstract void stop();

	abstract void accelerate(int a);

	abstract void brake(int b);
}

class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("car is started");
	}

	@Override
	void stop() {

		System.out.println("car is stops");

	}

	@Override
	void accelerate(int a) {
		System.out.println("car has a " + a + " accelerate");
	}

	@Override
	void brake(int b) {
		System.out.println("car has a " + b + " brake");
	}

}

class Bike extends Vehicle {

	@Override
	void start() {
		System.out.println("\nbike is started");

	}

	@Override
	void stop() {
		System.out.println("bike is stoped");

	}

	@Override
	void accelerate(int a) {
		System.out.println("Bike has a " + a + " accelerate");
	}

	@Override
	void brake(int b) {
		System.out.println("bike has a " + b + " brake");

	}

}

class Schooter extends Vehicle {

	@Override
	void start() {
		System.out.println("\nSchooter is started");

	}

	@Override
	void stop() {
		System.out.println("Schooter is stoped");

	}

	@Override
	void accelerate(int a) {
		System.out.println("Schooter has a " + a + " accelerate");
	}

	@Override
	void brake(int b) {
		System.out.println("Schooter has a " + b + " brake ");
	}

}

public class AbstractClassVehicleEg 
{

	public static void main(String[] args)
	{
		Vehicle v1= new Car();
		v1.start();
		v1.start();
		v1.accelerate(3);
		v1.brake(4);
		
		Vehicle v2= new Bike();
		v2.start();
		v2.stop();
		v2.accelerate(1);
		v2.brake(2);
		
		Vehicle v3= new Schooter();
		v3.start();
		v3.stop();
		v3.accelerate(2);
		v3.brake(1);
	}

}
