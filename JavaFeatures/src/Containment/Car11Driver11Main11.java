package Containment;

public class Car11Driver11Main11 
{
	public static void main(String[] args) {
		
Driver11 d1=new Driver11();
d1.setDid(1);
d1.setContact(987654334);
d1.setDname("Suresh Driver");

Car11 c=new Car11();
c.setId(111);
c.setPrice(9800000);
c.setName("creta");
c.setColor("red");
c.setDriver11(d1);

System.out.println("Car and Diver Details:");
System.out.println("Car Id:"+c.getId()+"\nCar Price:"+c.getPrice()+"\nCar name:"+c.getName()+"\nCar Color:"+c.getColor()+"\n"+d1);
//System.out.println(c.getDriver11());
}
}