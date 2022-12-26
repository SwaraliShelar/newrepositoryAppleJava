package AssignmentInheritancePolymorphism;

public class Vehicle {
	int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void wheels()
	{
		System.out.println("4 wheeler");
	}
	void headLight()
	{
		System.out.println("2 headligts");
	}
	void displayVehicle()
	{
		System.out.println("Price:"+price);
	}
}
