package WrittenTest6;

public class PersonAddressMain
{
public static void main(String[] args)
{
		
Address a1=new Address();
a1.setCity("satara");
a1.setState("Maharashtra");
a1.setCountry("India");

Person p1=new Person();
p1.setName("Swarali shelar");
p1.setAddres("At mhasave post varye tal dist satara.");
p1.setAddress(a1);

System.out.println("Name:"+p1.getName()+"\nAddress:"+p1.getAddres()+"\n"+a1);
}
}