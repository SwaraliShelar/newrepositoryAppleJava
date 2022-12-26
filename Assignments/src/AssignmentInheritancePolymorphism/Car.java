package AssignmentInheritancePolymorphism;
//single inheritance example 1
public class Car extends Vehicle {
String name,colour;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
	
}
void displayCar()
{
	displayVehicle();
	System.out.println("Car Name:"+getName()+"\nCar color:"+getColour());
}
}
