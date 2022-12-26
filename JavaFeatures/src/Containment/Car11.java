package Containment;
//example of containment
public class Car11 {
	private  int id,price;
	private String name,color;
	Driver11 d;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDriver11(Driver11 d)
	{
		this.d=d;
	}
	public Driver11 getDriver11()
	{
		return d;
	}
}
