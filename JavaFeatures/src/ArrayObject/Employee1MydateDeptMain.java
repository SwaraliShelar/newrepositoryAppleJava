package ArrayObject;

import java.util.Scanner;

public class Employee1MydateDeptMain 
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	
	Employee1 emp[]=new Employee1[2];
	
	for(int i=0;i<emp.length;i++)
	{
		System.out.println("enter a details about employee id,name,salary");	
		int eid=sc.nextInt();
		String ename=sc.next();
		int esal=sc.nextInt();
		
		Mydate my[]=new Mydate[1];
		for(int j=0;j<my.length;j++)
		{
		System.out.println("enter day,month,year:");
		String mday=sc.next();
		int mon=sc.nextInt();
		int mye=sc.nextInt();
		
		Mydate m=new Mydate();
		m.setDay(mday);
		m.setMonth(mon);
		m.setYear(mye);
		my[j]=m;
		}
		
		Dept de[]=new Dept[1];
		for(int k=0;k<de.length;k++)
		{
		System.out.println("enter a department id,name:");
		int did=sc.nextInt();
		String dnm=sc.next();
		
		Dept d=new Dept();
		d.setDid(did);
		d.setDname(dnm);
		de[k]=d;
		
		}
		
		Employee1 e=new Employee1();
		e.setEmp_id(eid);
		e.setEmp_name(ename);
		e.setSalary(esal);		
		
		emp[i]=e;
		e.setM(my);
		e.setD(de);
	}
	for(Employee1 e:emp)
	{
		for(Dept d:e.d)
		{
			if(d.getDname().equalsIgnoreCase("computer"))
			{
				System.out.println(e.getEmp_name()+" "+e.getSalary()+" "+d.getDid()+" "+d.getDname());
			}
			
		}
	}
}
}
/*for(Mydate m:e.m)//only need when you want to get value from getter
{
	System.out.println(m);
}*/
