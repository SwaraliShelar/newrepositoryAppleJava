package Containment;

public class PersonAddressMain
{
	public static void main(String[] args) {
	Address a1=new Address("shivaji nagar","pune","maharashtra","41765");
	Address a2=new Address("malhar peth","satara","maharashtra","4150015");
	Address a3=new Address("shinivar peth","pune","maharashtra","414006");

Person p1=new Person(1,"swara shelar","98765423465","Swara@123",a1);
Person p2=new Person(2,"pooja shelar","8765432123","pooja@123",a2);
Person p3=new Person(3,"uday shelar","98765423465","uday@123",a3);

System.out.println(p1+"\n"+p2+"\n"+p3);
}
}