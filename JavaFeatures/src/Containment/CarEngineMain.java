package Containment;

public class CarEngineMain {
public static void main(String[] args) {
	/*Engine e1=new Engine(4,89,"tata","150");
	  Car c11=new Car(1,9500000,"zenn","red",e1);
      System.out.println(c11);*/

Engine e1=new Engine();
e1.setPower("1000");
e1.setCompany("TATA");
e1.setCylinder(4);
e1.setTorque(89);

Car c1=new Car();
c1.setId(1);
c1.setColor("red");
c1.setName("zenn");
c1.setPrice(950000);
c1.setEngine(e1);

System.out.println("information about car:");
System.out.println(c1.getId()+"\n"+c1.getColor()+"\n"+c1.getName()+"\n"+c1.getPrice());
System.out.println(c1.getEngine());
}
}