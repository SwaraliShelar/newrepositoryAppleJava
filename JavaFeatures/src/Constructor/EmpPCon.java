package Constructor;

public class EmpPCon {
	
	int id,salary;
	String name,dept;
	float pf;
	
	EmpPCon()//use define default constructor 
	{
		id=1;
		salary=40000;
		name="satish";
		dept="economics";
		pf=0.10f;
	}
	EmpPCon(int i1,int s1,String n1,String d1,Float p1)
	{
		id=i1;
		salary=s1;
		name=n1;
		dept=d1;
		pf=p1;
	}
	public String toString()
	{
		return id+" "+salary+" "+name+" "+dept+" "+pf;
	}
public static void main(String[] args) 
{
	EmpPCon epc1=new EmpPCon ();
	EmpPCon epc11=new EmpPCon ();

	System.out.println(epc1);
	System.out.println("--------------------------");
	System.out.println(epc11);

      System.out.println();
      //you can create two object 
	EmpPCon epc2=new EmpPCon (3,50000,"pooja","science",0.20f);
	EmpPCon epc22=new EmpPCon (4,70000,"ramesh","commerce",0.40f);

	System.out.println(epc2);
	System.out.println("----------------------------");
	
	System.out.println(epc22);


}
}
